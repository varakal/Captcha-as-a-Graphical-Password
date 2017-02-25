package com.amutha.User;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.mail.Session;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.amutha.Database.UserDAO;
import com.amutha.Database.adduserdao;
import com.amutha.Database.admindao;
import com.amutha.support.GenerateRandomNumber;
import com.amutha.support.Send_SMS_Service;


public class ConfirmBenificiary extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
     
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		PrintWriter out = response.getWriter();
		String userAccNumber = "",accountNumber = "",accountHolderName="",mobileNumber="",submit="",msg="";
	    boolean flag = false;
	    int check = 0,urn=0;
	    RequestDispatcher rd;
	    ResultSet rs = null;
		HttpSession hs=request.getSession();
		
	    try 
	    {
		   
	       userAccNumber = (String) hs.getAttribute("userid");
	       
	       String accno = admindao.getAccNo(userAccNumber);
	       
	      
	       
	       System.out.println("userAccNumber :"+userAccNumber);
	       
	       accountNumber = request.getParameter("acc_no");	
	       accountHolderName = request.getParameter("acc_name");
	       
	       submit = request.getParameter("RegAction");
	       
	       if(submit.equals("Confirm Registeration"))
	       {
	    	   urn = GenerateRandomNumber.generate4digitNumber();
	    	   flag = UserDAO.addAccountBenificiaryDetails(accno,accountNumber,accountHolderName, urn);
	    	   if(flag)
	    	   {
	    		   rs = adduserdao.getAccountDetailsById(accno);
	    		   while(rs.next())
	    		   {
	    			   mobileNumber = rs.getString("mobileno");
	    		   }
	    			   
	    		   msg = "URN Number : " + urn+"\n"+"Now You Can Confirm the Benificiary By Providing the URN Number.";
	    		  // flag = SendMSG.sendSMS(mobileNumber,msg);
	    		   
	    		   boolean flg = Send_SMS_Service.sendSMS(mobileNumber.trim(), msg.trim());
				    
	    		   if(flg)
	    		   {
	    			   hs.setAttribute("status","Yes");
	    			   System.out.println("URN Number Sent Sucessfully to MobileNumber : " + mobileNumber);
	    			   rd = request.getRequestDispatcher("Res/JSP/User/reg_get_benificiary_details.jsp?no=1");
	    			   rd.forward(request, response);
	    		   }
	    		   else
	    		   {
	    			   System.out.println("Opps,Unable to Send URN Number to MobileNumber : " + mobileNumber);
	    			   hs.setAttribute("status","No");
	    			   System.out.println("URN Number Sent Sucessfully to MobileNumber : " + mobileNumber);
	    			   rd = request.getRequestDispatcher("Res/JSP/User/reg_get_benificiary_details.jsp?no=2");
	    			   rd.forward(request, response);
	    		   }
	    		   
	    		  
	    	   }
	    	   else
	    	   {
	    		   System.out.println("Opps,Somthing Went Wrong!!!");
	    	   }
		       
	       }
	       else
	       {
	    	   System.out.println("Registration Canceled...............");
	       }
		  
	    }
	    
	    catch (Exception e) 
	    {
	    	System.out.println("Opps,Exception in User-ConfirmBenificiary Servelet :");
	    	e.printStackTrace();
		}
	    finally
	    { 
	        out.close();
	    }
	}

}

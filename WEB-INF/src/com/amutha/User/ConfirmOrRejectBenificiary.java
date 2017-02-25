package com.amutha.User;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.amutha.Database.UserDAO;
import com.amutha.Database.admindao;



public class ConfirmOrRejectBenificiary extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
     
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		PrintWriter out = response.getWriter();
		String userAccNumber="",accountNumber = "",accountHolderName="",submit="";
		String urn = "";
	    boolean flag = false;
	    int check = 0;
	    RequestDispatcher rd;
	    ResultSet rs = null;
		HttpSession session=request.getSession();
		
	    try 
	    {
		   
	    	 userAccNumber = (String) session.getAttribute("userid");
		       
		     
	       String accno = admindao.getAccNo(userAccNumber);
	       
	       accountNumber = request.getParameter("acc_no").trim();	
	       urn = request.getParameter("urn").trim();
	       
	       submit = request.getParameter("Action");
	       
	       if(submit.equals("Confirm"))
	       {
	    	   
	    	   System.out.println("Start...");
	    	   
	    	   check = UserDAO.checkUrnExistance(accno,accountNumber,urn);
	    	   
	    	   if(check == 0)
	    	   {
	    		   System.out.println("Start...xvxcv");
	    		   
	    		   //session.setAttribute("urnExistenceStatus","Yes");
	    		   rd = request.getRequestDispatcher("Res/JSP/User/confirm_benificiary.jsp");
	    		   rd.forward(request,response);
	    	   }
	    	   else
	    	   {
	    		   
	    		   System.out.println("Start... xcvxc xcbxc");
	    		   
	    		   flag = UserDAO.updateBenificiaryConfirmationStatus(accno,accountNumber);
	    		   if(flag)
	    		   {
	    			   System.out.println("Benificiary Confirmed Sucessfully.....");
		    		   
		    		   //session.setAttribute("confirmationStaus","Yes");
	    			   rd = request.getRequestDispatcher("Res/JSP/User/confirm_benificiary.jsp?no=4");
	    			   rd.forward(request, response);
	    		   }
	    		   else
	    		   {
	    			   System.out.println("Opps,Something Went Wrong, Try Again...");
	    			   
	    			  // session.setAttribute("confirmationStaus","No");
		    		   rd = request.getRequestDispatcher("Res/JSP/User/confirm_benificiary.jsp?no=3");
		    		   rd.forward(request,response);
	    		   }
	    			   
	    	   }
		       
	       }
	       else
	       {
	    	   flag = UserDAO.deleteBenificiaryDetails(userAccNumber,accountNumber);
	    	   if(flag)
	    	   {
	    		   System.out.println("Benificiary Rejected Sucessfully.....");
	    		   
	    		   request.setAttribute("reject","Yes");
    			   rd = request.getRequestDispatcher("usercontent.jsp");
    			   rd.forward(request, response);
	    	   }
	    	   else
	    	   {
	    		   System.out.println("Benificiary Rejection Process Failed...");
	    	   }
	    	   
	    	   
	       }
	       
	    }
	    
	    catch (Exception e) 
	    {
	    	System.out.println("Opps,Exception in User-ConfirmOrRejectBenificiary Servelet :");
	    	e.printStackTrace();
		}
	    finally
	    { 
	        out.close();
	    }
	}

}

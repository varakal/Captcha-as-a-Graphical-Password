/**
 * @author Amutha
 */
package com.amutha.User;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Map;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.amutha.Database.DAO;
import com.amutha.Database.UserDAO;
import com.amutha.imageprocess.ImageProcess;




public class Login extends HttpServlet 
{
	public void doPost(HttpServletRequest request,HttpServletResponse response)throws IOException
	{
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();
		boolean flag = false;
		
		try
		{
			//get User Details //
			String userid=request.getParameter("uid");
			String pass=request.getParameter("pwd");
			
			
			boolean fg = UserDAO.checkLogin(userid, pass);

			if(fg)
			{
				
				session.setAttribute("userid",userid);
				
				ArrayList uselectedimage = UserDAO.getSelectedImage(userid);
				
				// Check Captcha Graphical Password //
				flag = ImageProcess.loginCGPCheck(uselectedimage,userid);
				
				if(flag)
				{
					session.setAttribute("userid",userid);
										
					RequestDispatcher rd=request.getRequestDispatcher("/gpcheck.jsp?no=0&count=1");
					rd.forward(request, response);
				}
				else
				{
					response.sendRedirect(request.getContextPath()+"?no=1");
				}
				
				
				
			}
			else
			{
				response.sendRedirect(request.getContextPath()+"?no=1");
			}
		}
		catch(Exception e)
		{
			System.out.println("Opps's Exception is in User->NewUser Servlet : ");
			e.printStackTrace();
			out.println("Opps's Exception is in User->NewUser Servlet : ");
			e.printStackTrace();
		}
	}
}


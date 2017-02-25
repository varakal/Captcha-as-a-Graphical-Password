package com.amutha.User;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.amutha.Database.DAO;
import com.amutha.Database.UserDAO;
import com.amutha.support.Algo;
import com.amutha.support.HashingTechnique;
import com.amutha.support.RandomValue;

public class PasswordSet extends HttpServlet
{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();
		RequestDispatcher rd=null;
		
		boolean flag = false;
		
		String uid = session.getAttribute("userid").toString();
		/*String nm = session.getAttribute("name").toString();
		String email = session.getAttribute("uemail").toString();
		String pass = session.getAttribute("upass").toString();
		*/
		//String userdatas = UserDAO.getOffsetInfo(uid);
		
		int hkey = RandomValue.hash_key();
		
		StringBuffer sb = new StringBuffer();
		List user_coordinates = UserDAO.getImagecode(uid);
		 Collections.sort(user_coordinates);
		 
		 for(int i=0;i<user_coordinates.size();i++)
		 {
			 sb.append(user_coordinates.get(i)+"~"); 
		 }
		
		// MAC Creation
		String has_mac = HashingTechnique.MD5(sb.toString());
		System.out.println("has_mac------>>>"+has_mac);
		
	/*	 flag = UserDAO.insertUser(uid, nm, pass, email, has_mac);
		
		if(flag)
		{
			
			rd = request.getRequestDispatcher("index.jsp?no=1");
			rd.forward(request,response);
			
		}
		else
		{
			rd = request.getRequestDispatcher("index.jsp?no=1");
			rd.forward(request,response);
			
			
		}
		*/
	}
}

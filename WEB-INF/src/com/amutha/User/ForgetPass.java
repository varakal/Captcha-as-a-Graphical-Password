package com.amutha.User;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.amutha.Database.DAO;
import com.amutha.imageprocess.ImageProcess;

public class ForgetPass extends HttpServlet
{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException
			{
		
		String uid = req.getParameter("uid");
		
		int b = DAO.checkUID(uid);
		
		if(b!=0)
		{
			
			RequestDispatcher rd=req.getRequestDispatcher("password_set.jsp?no=0&user="+uid);
			rd.forward(req, resp);
		}
		
		
	}
}

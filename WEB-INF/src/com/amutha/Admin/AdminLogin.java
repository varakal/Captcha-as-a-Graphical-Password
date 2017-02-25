package com.amutha.Admin;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.amutha.Database.admindao;

public class AdminLogin extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out = response.getWriter();

		// System.out.println("doPost");
		int flag = 0;
		String name = "";
		RequestDispatcher rd;
		HttpSession hs1 = request.getSession();

		try
		{
			String admin_id = request.getParameter("adminid");
			String admin_password = request.getParameter("pwd");

			System.out.println("Username : " + admin_id);
			System.out.println("Password : " + admin_password);

			flag = admindao.logindao(admin_id, admin_password);
			if (flag == 1)
			{
				name = admindao.username(admin_id);
				hs1.setAttribute("admin_id", admin_id);
				hs1.setAttribute("admin_name", name);
				rd = request
						.getRequestDispatcher("/Res/JSP/Admin/adminhome.jsp");
				rd.forward(request, response);
			}
			else if (flag == 0)
			{
				//hs1.setAttribute("loginstatus", "failed");
				rd = request.getRequestDispatcher("index.jsp?no=1");
				rd.forward(request, response);
			}

		}
		catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			out.close();
		}
	}
}

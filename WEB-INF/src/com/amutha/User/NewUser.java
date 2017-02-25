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
import com.amutha.imageprocess.ImageProcess;




public class NewUser extends HttpServlet 
{
	public void doPost(HttpServletRequest request,HttpServletResponse response)throws IOException
	{
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();
		boolean flag = false;
		
		try
		{
			//get User Details //
			String userid=request.getParameter("id");
			String name=request.getParameter("name");
			String uemail=request.getParameter("email");
			String upass=request.getParameter("password");
			
			
			

			// Retrieve the Images from DB //
			Map m = DAO.retrieveImage();
			ArrayList<Integer> img_code1 =(ArrayList) m.get("Image_Code") ;
			ArrayList<String> img_name1 =(ArrayList) m.get("Image_Name") ;


			// Randomly Select 9 Images //
			ArrayList<Integer> rand=new ArrayList<Integer>();

			for(int i=0;i<9;i++)
			{
				Random r = new Random();
				
				int val = r.nextInt(img_name1.size());
				
				//System.out.println("Value :"+val);
				
				while(rand.contains(val))
				{
					// Check Same Image Code or Not ..for duplication//
					val = r.nextInt(img_name1.size());
					
					//System.out.println("Value xvcv:"+val);
				}
				
					rand.add(val);
				
			}

			System.out.println("Image List :"+rand);
			ArrayList<String> rand1=new ArrayList<String>();
			ArrayList<String> selected_imgcode=new ArrayList<String>();
			ArrayList<String> matrix=ImageProcess.MatrixValue();

			for(int j=0;j<rand.size();j++)
			{
				int r = Integer.parseInt(rand.get(j).toString());
				
				rand1.add(img_name1.get(r).toString());
				selected_imgcode.add(img_code1.get(r).toString());
			}


			System.out.println("Image Name :"+rand1);
			System.out.println("Image Code :"+selected_imgcode);
			System.out.println("Image Matrix :"+matrix);


			boolean fg = ImageProcess.UpdateSelectedImage(rand1,matrix,selected_imgcode,userid);

			
			if(fg)
			{
				String conf="Ok";
				session.setAttribute("userid",userid);
				session.setAttribute("name",name);
				session.setAttribute("uemail",uemail);
				session.setAttribute("upass",upass);
				
				
				RequestDispatcher rd=request.getRequestDispatcher("/show.jsp?no=0");
				rd.forward(request, response);
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


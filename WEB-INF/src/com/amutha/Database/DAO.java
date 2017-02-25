/**
 * 
 */
package com.amutha.Database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.sun.corba.se.spi.orbutil.fsm.State;


public class DAO 
{
	private static DAO dao=null;
		public static DAO getInstance()
	{
		if(dao==null)
		{
			dao=new DAO();
		}
		return dao;
	}
	public Connection connector()
	{
		Connection con=null;
		try {

			Class.forName(Global.JDBC_DRIVER);
			
			System.out.println("Driver has loaded");
			con = DriverManager.getConnection(Global.JDBC_HOST_URL_WITH_DBNAME,Global.DATABASE_USERNAME, Global.DATABASE_PASSWORD);
			System.out.println("Connected" + con);

		} catch (Exception e) 
		{
			System.out.println("Exception in serverconnector-->connector(): "+ e);
		}
		return con;
	}
	
	public static ArrayList getImage()
	{
		
		ArrayList list = new ArrayList();
		try
		{
			DAO dao=DAO.getInstance();
			Connection connection=dao.connector();
			Statement statement = connection.createStatement();
			
			String sql="select img_name from m_image";
			
			System.out.println(sql);
			
			ResultSet resultSet = statement.executeQuery(sql);
			
			while(resultSet.next())
			{
				list.add(resultSet.getString(1));
			}
			
			
		}
		catch(Exception e)
		{
			System.out.println("Exception in DAO-->getImage(): "+ e);
		}
		
		return list;
	}
	public static Map retrieveImage()
	{
		Map m=new HashMap(); 
		
		ArrayList<Integer> img_code = new ArrayList<Integer>();
		ArrayList<String> img_name = new ArrayList<String>();
		try
		{
			DAO dao=DAO.getInstance();
			Connection connection=dao.connector();
			Statement statement = connection.createStatement();
			String sql = "select img_id,img_name from m_image";
			
			ResultSet resultSet = statement.executeQuery(sql);
			 while(resultSet.next())
			 {
				img_code.add(resultSet.getInt(1)) ;
				img_name.add(resultSet.getString(2));
			 }
			 int len = img_code.size();
			 int len1 = img_name.size();
			 System.out.println("len"+len+" "+"len1 "+len1);
			 
			 m.put("Image_Code", img_code);
			 m.put("Image_Name", img_name);
			 
			System.out.println("Retrieving Process Completed......");
		}
		catch(Exception e)
		{
			System.out.println("Exception in --> "+ e);
		}
		return m;
	}
	public static boolean updateSelectedImage(String code,String imgname,String row,String column,String uid)
	{
		
		boolean flag =false;
		try
		{
			DAO dao=DAO.getInstance();
			Connection connection=dao.connector();
			Statement statement = connection.createStatement();
			
			String sql="insert into img_selected(img_code,img_name,img_row,img_col,Actual,for_img,off_set,selected,userid) values('"+code+"','"+imgname+"','"+row+"','"+column+"','0','0','0','0','"+uid+"')";
			
			System.out.println(sql);
			
			int i = statement.executeUpdate(sql);
			
			if(i!=0)
			{
				flag=true;
			}
			
			
		}
		catch(Exception e)
		{
			System.out.println("Exception in DAO-->getImage(): "+ e);
		}
		
		return flag;
	}
	
	public static boolean updateUserSelectedImage(String code,String imgname,String row,String column,String uid,int id)
	{
		
		boolean flag =false;
		try
		{
			DAO dao=DAO.getInstance();
			Connection connection=dao.connector();
			Statement statement = connection.createStatement();
			
			String sql="update img_selected set img_code='"+code+"',img_name='"+imgname+"',img_row='"+row+"',img_col='"+column+"',Actual='0',for_img='0',off_set='0',selected='0' where userid='"+uid+"' and img_id='"+id+"'";
			
			System.out.println(sql);
			
			int i = statement.executeUpdate(sql);
			
			if(i!=0)
			{
				flag=true;
			}
			
			
		}
		catch(Exception e)
		{
			System.out.println("Exception in DAO-->getImage(): "+ e);
		}
		
		return flag;
	}
	
	public static int checkUID(String uid)
	{
		
		boolean flag =false;
		int imgid=0;
		try
		{
			DAO dao=DAO.getInstance();
			Connection connection=dao.connector();
			Statement statement = connection.createStatement();
			
			String sql="select img_id from img_selected where userid='"+uid+"' limit 1";
			
			System.out.println(sql);
			
			ResultSet i = statement.executeQuery(sql);
			
			while(i.next())
			{
				imgid = i.getInt(1);
			}
			
			
		}
		catch(Exception e)
		{
			System.out.println("Exception in DAO-->getImage(): "+ e);
		}
		
		return imgid;
	}
	
	
	public static boolean updateloginSelectedImage(String code,String imgname,String row,String column,String uid)
	{
		
		boolean flag =false;
		try
		{
			DAO dao=DAO.getInstance();
			Connection connection=dao.connector();
			Statement statement = connection.createStatement();
			
			String sql="insert into cgp_logincheck(img_code,img_name,img_row,img_col,for_img,off_set,selected,userid) values('"+code+"','"+imgname+"','"+row+"','"+column+"','0','0','0','"+uid+"')";
			
			System.out.println(sql);
			
			int i = statement.executeUpdate(sql);
			
			if(i!=0)
			{
				flag=true;
			}
			
			
		}
		catch(Exception e)
		{
			System.out.println("Exception in DAO-->getImage(): "+ e);
		}
		
		return flag;
	}
	
	public static boolean updateSeImage(String imgnm,int x,int y,String xcoordinate,String ycoordinate)
	{
		
		boolean flag =false;
		try
		{
			DAO dao=DAO.getInstance();
			Connection connection=dao.connector();
			Statement statement = connection.createStatement();
			
			String sql="update img_selected set off_set='"+x+","+y+"',for_img='"+xcoordinate+","+ycoordinate+"',selected='Y' where img_name='"+imgnm+"'";
			
			System.out.println(sql);
			
			int i = statement.executeUpdate(sql);
			
			if(i!=0)
			{
				flag=true;
			}
			
			
		}
		catch(Exception e)
		{
			System.out.println("Exception in DAO-->getImage(): "+ e);
		}
		
		return flag;
	}
	
	public static boolean updateUserImage(String imgnm,int x,int y,String xcoordinate,String ycoordinate)
	{
		
		boolean flag =false;
		try
		{
			DAO dao=DAO.getInstance();
			Connection connection=dao.connector();
			Statement statement = connection.createStatement();
			
			String sql="update cgp_logincheck set off_set='"+x+","+y+"',for_img='"+xcoordinate+","+ycoordinate+"',selected='Y' where img_name='"+imgnm+"'";
			
			System.out.println(sql);
			
			int i = statement.executeUpdate(sql);
			
			if(i!=0)
			{
				flag=true;
			}
			
			
		}
		catch(Exception e)
		{
			System.out.println("Exception in DAO-->updateUserImage(): "+ e);
		}
		
		return flag;
	}
	
	
	public static ArrayList getImageName(String uid)
	{
		
		ArrayList list = new ArrayList();
		try
		{
			DAO dao=DAO.getInstance();
			Connection connection=dao.connector();
			Statement statement = connection.createStatement();
			
			String sql="select img_name from img_selected where userid='"+uid+"'";
			
			System.out.println(sql);
			
			ResultSet i = statement.executeQuery(sql);
			
			while(i.next())
			{
				list.add(i.getString(1));
				
			}
			
		}
		catch(Exception e)
		{
			System.out.println("Exception in DAO-->getImage(): "+ e);
		}
		
		return list;
	}
	
	public static ArrayList loginImageName(String uid)
	{
		
		ArrayList list = new ArrayList();
		try
		{
			DAO dao=DAO.getInstance();
			Connection connection=dao.connector();
			Statement statement = connection.createStatement();
			
			String sql="select img_name from cgp_logincheck where userid='"+uid+"'";
			
			System.out.println(sql);
			
			ResultSet i = statement.executeQuery(sql);
			
			while(i.next())
			{
				list.add(i.getString(1));
				
			}
			
		}
		catch(Exception e)
		{
			System.out.println("Exception in DAO-->getImage(): "+ e);
		}
		
		return list;
	}
	
}

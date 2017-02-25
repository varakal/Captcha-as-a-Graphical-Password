package com.amutha.imageprocess;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Random;

import com.amutha.Database.DAO;
import com.amutha.Database.UserDAO;

public class ImageProcess {
	
	public static ArrayList MatrixValue()
	{
		
		ArrayList list = new ArrayList();
		
		list.add("0,0");
		list.add("0,1");
		list.add("0,2");
		
		list.add("1,0");
		list.add("1,1");
		list.add("1,2");
		
		list.add("2,0");
		list.add("2,1");
		list.add("2,2");
		
		System.out.println("hashtable values :"+list);
		return list;
	}
	
	public static boolean UpdateSelectedImage(ArrayList imgnm,ArrayList matrix,ArrayList imgcode,String uid)
	{
		
		boolean fl=false;
		
		int b = DAO.checkUID(uid);
		if(b!=0)
		{
			for(int i=0;i<imgnm.size();i++)
			{
						
				String img_name = imgnm.get(i).toString();
				//img_name = img_name.substring(33, img_name.length());
				
				System.out.println("img_name :"+img_name);
				String img_code = imgcode.get(i).toString();
				String[] img_matrix = matrix.get(i).toString().split(",");
				
				String row =img_matrix[0];
				String col =img_matrix[1];
				
				int imgid=b+i;
				
				fl = DAO.updateUserSelectedImage(img_code, img_name, row, col,uid,imgid);
				
			}	
		}
		else
		{
		
			for(int i=0;i<imgnm.size();i++)
			{
						
				String img_name = imgnm.get(i).toString();
				//img_name = img_name.substring(33, img_name.length());
				
				System.out.println("img_name :"+img_name);
				String img_code = imgcode.get(i).toString();
				String[] img_matrix = matrix.get(i).toString().split(",");
				
				String row =img_matrix[0];
				String col =img_matrix[1];
				
				fl = DAO.updateSelectedImage(img_code, img_name, row, col,uid);
				
			}
		}
		
		
		return fl;
		
		
	}
	
	public static boolean loginSelectedImage(ArrayList imgnm,ArrayList matrix,ArrayList imgcode,String uid)
	{
		
		boolean fl=false;
		for(int i=0;i<imgnm.size();i++)
		{
			
			String img_name = imgnm.get(i).toString();
			//img_name = img_name.substring(33, img_name.length());
			
			System.out.println("img_name :"+img_name);
			String img_code = imgcode.get(i).toString();
			String[] img_matrix = matrix.get(i).toString().split(",");
			
			String row =img_matrix[0];
			String col =img_matrix[1];
			
			
			
			fl = DAO.updateloginSelectedImage(img_code, img_name, row, col,uid);
			
			
		}
		
		return fl;
		
		
	}
	
	
	public static boolean loginCGPCheck(ArrayList uselectedimage,String uid)
	{
		
		boolean flag=false;
		ArrayList<Integer> rand=new ArrayList<Integer>();
		
		
		// Retrieve the Images from DB //
		Map m = DAO.retrieveImage();
		ArrayList<Integer> img_code1 =(ArrayList) m.get("Image_Code") ;
		ArrayList<String> img_name1 =(ArrayList) m.get("Image_Name") ;

		
		
		for(int i=1;i<=uselectedimage.size();i++)
		{
			rand.add(i);
		}
		
		int no = 9-uselectedimage.size();
		
		System.out.println("Selected Images :"+no);
		
		ArrayList seleted_imagecode = UserDAO.getSelectedImageCode(uid);
		
		
		for(int i=0;i<img_code1.size();i++)
		{
			if(seleted_imagecode.contains(img_code1.get(i).toString()))
			{
				System.out.println("Remove Data :"+img_code1.get(i));
				img_code1.remove(img_code1.get(i));
				img_name1.remove(img_name1.get(i));
				
			}
			else
			{
				
				System.out.println("Not Removed Data :"+img_code1.get(i));
			}
			
			
		}
		
		
		
	
		// Randomly Select Images //
		
		for(int i=0;i<no;i++)
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
		System.out.println("Random Number :"+rand);
		
		
		removeArraylistElem(rand, uselectedimage.size());
		
		ArrayList<String> matrix=ImageProcess.MatrixValue();
		ArrayList<String> rand1=new ArrayList<String>();
		ArrayList<String> selected_imgcode=new ArrayList<String>();
		
		for(int k=0;k<uselectedimage.size();k++)
		{
		
			String[] imgcode = uselectedimage.get(k).toString().split("~");
			
			String icode = imgcode[0];
			String img = imgcode[1];
			
			selected_imgcode.add(icode);
			rand1.add(img);
			
		}
		
		for(int j=0;j<rand.size();j++)
		{
			
			int r = Integer.parseInt(rand.get(j).toString());
			
			rand1.add(img_name1.get(r).toString());
			selected_imgcode.add(img_code1.get(r).toString());
		}
		
		//shuffle the Images //
		
		System.out.println("Before Image List :"+rand1);
		System.out.println("Before Code :"+selected_imgcode);
		
		
		Map shuffled = selectRandomImage(rand1, selected_imgcode);
		
		ArrayList img_name=(ArrayList) shuffled.get("Image");
		ArrayList img_code=(ArrayList) shuffled.get("Code");
		
		boolean empty_table = UserDAO.emptyTable();
		System.out.println("empty_table status :"+empty_table);
		
		 flag = ImageProcess.loginSelectedImage(img_name,matrix,img_code,uid);

		
		return flag;
		
		
	}
	public static boolean removeArraylistElem(ArrayList uselectedimage,int size)
	{
		System.out.println("Size :"+size);
		if(size==1)
		{
			uselectedimage.remove(0);
		}
		else if(size==2)
		{
			uselectedimage.remove(0);
			uselectedimage.remove(0);
		}
		else if(size==3)
		{
			System.out.println("Check");
			uselectedimage.remove(0);
			
			uselectedimage.remove(0);
			
			uselectedimage.remove(0);
			
		}
		
		System.out.println("After Remove the Elements :"+uselectedimage);
		
		return true;
		
	}
	
	public static Map selectRandomImage(ArrayList imgname,ArrayList imgcode)
	{
		
		Map map = new HashMap();
		
		ArrayList<String> img_name=new ArrayList<String>();
		ArrayList<String> img_code=new ArrayList<String>();
		
		ArrayList<Integer> rand=new ArrayList<Integer>();
		
		
		for(int i=0;i<9;i++)
		{
			Random r = new Random();
			
			int val = r.nextInt(imgname.size());
			
			//System.out.println("Value :"+val);
			
			while(rand.contains(val))
			{
				// Check Same Image Code or Not ..for duplication//
				val = r.nextInt(imgname.size());
				
				//System.out.println("Value xvcv:"+val);
			}
			
				rand.add(val);
			
		}
		
		for(int j=0;j<rand.size();j++)
		{
			
			int r = Integer.parseInt(rand.get(j).toString());
			
			img_name.add(imgname.get(r).toString());
			img_code.add(imgcode.get(r).toString());
		}
		
		System.out.println("Image List :"+img_name);
		System.out.println("Image Code :"+img_code);
		
		map.put("Image", img_name);
		map.put("Code", img_code);
		return map;
	}
	
	public static void matchUserDatas()
	{
		
		
		List list = UserDAO.getImagecode("user");
		
		
		List list1 = UserDAO.getImagecode1("user");
		
		
		System.out.println("reg_coordinates :"+list);
		
	
		System.out.println("login_coordinates :"+list1);
		
		
		boolean flag = equalLists(list,list1);
		
		System.out.println("equalLists :"+flag);
		
		
	}
	
	public static boolean equalLists(List<String> one, List<String> two){     
	    if (one == null && two == null){
	        return true;
	    }

	    if((one == null && two != null) 
	      || one != null && two == null
	      || one.size() != two.size()){
	        return false;
	    }

	    //to avoid messing the order of the lists we will use a copy
	    //as noted in comments by A. R. S.
	    one = new ArrayList<String>(one); 
	    two = new ArrayList<String>(two);   

	    
	    
	    Collections.sort(one);
	    Collections.sort(two);  
	    
	    System.out.println("one :"+one+"......... two: "+two);
	    
	    return one.equals(two);
	}
	
	
	
	public static void main(String[] args)
	{
		
		ArrayList list = new ArrayList();
		list.add("21");
		list.add("38");
		
		boolean flag=false;
		ArrayList<Integer> rand=new ArrayList<Integer>();
		
		
		// Retrieve the Images from DB //
		Map m = DAO.retrieveImage();
		ArrayList<Integer> img_code1 =(ArrayList) m.get("Image_Code") ;
		ArrayList<String> img_name1 =(ArrayList) m.get("Image_Name") ;
		
		System.out.println("Original img_code1 :"+img_code1);
		
		System.out.println("List :"+list);
		
		int no = 9-list.size();
		
		for(int i=0;i<img_code1.size();i++)
		{
			if(list.contains(img_code1.get(i).toString()))
			{
				System.out.println("Remove Data :"+img_code1.get(i));
				img_code1.remove(img_code1.get(i));
				
			}
			else
			{
				
				System.out.println("Not Removed Data :"+img_code1.get(i));
			}
			
			
		}
		
		System.out.println("After Removed img_code1 :"+img_code1);
		
	}


}

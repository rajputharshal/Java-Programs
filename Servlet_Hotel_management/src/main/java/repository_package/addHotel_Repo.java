package repository_package;

import model_package.addHotelInfo_model;
import model_package.addHotel_model;

import java.sql.SQLException;
import java.util.*;
public class addHotel_Repo extends dbConfig
{
	
	public boolean isaddHotelrepo(addHotel_model addModel)
	{
		try 
		{
			pstm=con.prepareStatement("insert into hotels values(?,?)");
			pstm.setInt(1,addModel.hotelid);
			pstm.setString(2,addModel.hotelname);
			int b=pstm.executeUpdate();
			
			return b>0? true:false;
		}
		catch(Exception e)
		{
			System.out.println(e);
			return false;
		}
		
	}
	
	
	ArrayList<addHotel_model> list=new ArrayList<addHotel_model>();
	public List<addHotel_model> viewHoltes()
	{
		try
		{
			pstm=con.prepareStatement("select * from hotels");
			rs=pstm.executeQuery();
			while(rs.next())
			{
				addHotel_model view=new addHotel_model();
				view.setHotelid(rs.getInt(1));
				view.setHotelName(rs.getString(2));
				list.add(view);
			}
			return list;
		}
		catch(Exception ex)
		{
			System.out.println(ex);
			return null;
		}
		
	}
	//delete hotel...................................................
	public boolean isDeleteHotel_Repo(int id)
	{
		try
		{
			pstm=con.prepareStatement("delete from hotels where id=?");
			pstm.setInt(1,id);
			int val=pstm.executeUpdate();
			if(val>1)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch(Exception ex)
		{
			
		}
		return false;
	}
	
	int getHotelId(String name)//getid
	{
		try
		{
			pstm=con.prepareStatement("select id from hotels where name=?");
			pstm.setString(1,name);
			rs=pstm.executeQuery();
			if(rs.next())
			{
				return rs.getInt(1);//getInt??????/
			}
			else
			{
				return 0;
			}
		}
		catch(Exception ex)
		{
			return 0;
		}
	}
	public boolean setHotelInfo_repo(addHotelInfo_model model) 
	{
		try
		{
			int id=this.getHotelId( model.getHotelname());

			pstm=con.prepareStatement("insert into hotelinfo values(?,?,?,?,?,?)");
			pstm.setInt(1,model.getIid());
			pstm.setInt(2,model.getContact());
			pstm.setString(3,model.getEmail());
			pstm.setString(4,model.getLocation());
			pstm.setString(5,model.getAddress());
			pstm.setInt(6,id);
			int val=pstm.executeUpdate();
			System.out.println(val);
			System.out.println(id);
			if(val>0)
			{
				return true;
			}
			else
			{
				return false;
			}
			
		}
		catch(Exception ex)
		{
			return false;
		}
		
	}
	private Object getEmail() {
		// TODO Auto-generated method stub
		return null;
	}
}

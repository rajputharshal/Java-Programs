package repository_package;


import java.util.ArrayList;
import java.util.List;

import model_package.addHotelInfo_model;

public class viewHotelInfo_repo extends dbConfig
{
	ArrayList<addHotelInfo_model> list=new ArrayList<addHotelInfo_model>();
	public ArrayList<addHotelInfo_model> getHotelInfo() //set hotel info
	{	
		try
		{
			pstm=con.prepareStatement("select f.iid,h.name,f.Contact,f.Email,f.Location,f.Address from hotels h join hotelinfo f on h.id=f.id;");
			rs=pstm.executeQuery();
			//System.out.println(rs);
			while(rs.next())
			{
				addHotelInfo_model info=new addHotelInfo_model();
				info.setHotelid(rs.getInt(1));
				info.setHotelName(rs.getString(2));
				info.setContact(rs.getInt(3));
				info.setEmail(rs.getString(4));
				info.setLocation(rs.getString(5));
				info.setAddress(rs.getString(6));
				list.add(info);	
			}
			return list;
		}
		catch(Exception ex)
		{
			System.out.println(ex);
			return null;
		}
	}
	//delete hotel information
	public boolean deleteInfoRepo(int id)
	{
		try
		{
			pstm=con.prepareStatement("delete from hotelinfo where Iid=?");
			pstm.setInt(1, id);
			int val=pstm.executeUpdate();
			
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
	//update................................................
	public boolean getupdatehotelinfo(addHotelInfo_model model)
	{
		System.out.println(model);
		try
		{
			pstm=con.prepareStatement("update hotelinfo set contact=?,email=?,location=?,address=? where Iid=?");
			pstm.setInt(1,model.getContact());
			pstm.setString(2,model.getEmail());
			pstm.setString(3,model.getLocation());
			pstm.setString(4,model.getAddress());
			pstm.setInt(5,model.getHotelid());
			
			int b=pstm.executeUpdate();
			if(b>0){
				return true;
				
			}
			else
			{
				return false;
			}
		}
		catch(Exception x)
		{
			System.out.println(x);
			return false;
		}
	}

}


package repositery;

import java.sql.SQLException;

import model.admin_model;

public class admin_repo extends dbconfig
{
	public boolean ismodel(admin_model model)
	{
		try 
		{
			pst=con.prepareStatement("select * from hotels where name=? and password=?");
			pst.setString(1,model.getName());
			pst.setString(2,model.getPass());
			rs=pst.executeQuery();
			if(rs.next())
			{
				return true;
			}
			else
			{
				return false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return true;
		}
	}
	
	
}

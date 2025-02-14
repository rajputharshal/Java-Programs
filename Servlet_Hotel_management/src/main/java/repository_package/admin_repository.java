package repository_package;

import model_package.admin_model;

public class admin_repository extends dbConfig
{
	
	public boolean isAdminLogin(admin_model model)
	{
		try
		{
			pstm=con.prepareStatement("select * from admin where name=? and password=?");
			 pstm.setString(1,model.getName());
			 pstm.setString(2,model.getPassword());
			 rs=pstm.executeQuery();
			 if(rs.next())
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
			System.out.println(ex); 
			return false;
		}
	}

}

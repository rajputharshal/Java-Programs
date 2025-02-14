package repository_package;

import model_package.addHotel_model;

public class UpdateHotel_repo extends dbConfig
{
	public boolean updaterepo(addHotel_model model)
	{
		try
		{
			pstm=con.prepareStatement("update hotels set name=? where id=?");
			pstm.setString(1,model.getHotelname());
			pstm.setInt(2,model.getHotelid());
			int val=pstm.executeUpdate();
			return val>0?  true: false;
		}
		catch(Exception ex)
		{
			System.out.println(ex);
			return false;
		}
	}
}

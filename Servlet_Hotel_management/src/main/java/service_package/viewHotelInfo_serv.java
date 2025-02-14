package service_package;


import java.util.List;

import model_package.addHotelInfo_model;
import repository_package.viewHotelInfo_repo;

public class viewHotelInfo_serv {
	viewHotelInfo_repo repo=new viewHotelInfo_repo();
	public List<addHotelInfo_model> viewInfo()
	{
		return repo.getHotelInfo();
	}
	
	//delete hotel information....................................................
	
	public boolean deleteInfoserv(int id)
	{
		System.out.println("serv"+ id);
		return repo.deleteInfoRepo(id);
	}
	//update........................................................................
	public boolean updatehotelinfo(addHotelInfo_model model)
	{
		System.out.println(model);
		
		return repo.getupdatehotelinfo(model);
	}
}

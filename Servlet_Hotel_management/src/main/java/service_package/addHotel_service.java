package service_package;

import java.util.List;

import model_package.addHotelInfo_model;
import model_package.addHotel_model;
import repository_package.addHotel_Repo;

public class addHotel_service 
{
	 addHotel_Repo addrepo=new addHotel_Repo();//add hotel
	 public boolean isaddHotelserv(addHotel_model addHotel)
	 {
		 return addrepo.isaddHotelrepo(addHotel);
	 }
	 
	 public List<addHotel_model>viewHoltes()//view hotel
	 {
		 return addrepo.viewHoltes();
	 }
	 
	 addHotel_Repo repo=new addHotel_Repo();
	 public boolean isdeleteHotel_serv(int id)//delete hotel
	 {
		 return addrepo.isDeleteHotel_Repo(id);
	 }
	 
	 public boolean addHotelInfo_serv(addHotelInfo_model model)//add information
	 {
		 return addrepo.setHotelInfo_repo(model);
	 }
}


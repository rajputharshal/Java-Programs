package service_package;

import model_package.addHotel_model;
import repository_package.UpdateHotel_repo;

public class updateHotel_serv {
	UpdateHotel_repo repo=new UpdateHotel_repo();
	public boolean updateservice(addHotel_model model)
	{
		return repo.updaterepo(model);
	}

}

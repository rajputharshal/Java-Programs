package service;

import model.admin_model;
import repositery.admin_repo;

public class adminser {
	admin_repo arepo=new admin_repo();
	public boolean ismodel(admin_model model)
	{
		return  arepo.ismodel(model);
	}
}

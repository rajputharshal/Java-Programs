package service_package;

import model_package.admin_model;
import repository_package.admin_repository;

public class admin_service {
	admin_repository adrepo=new admin_repository();
	
	public boolean isAdminLogin(admin_model model) {
		
		return adrepo.isAdminLogin(model);
	}
	
}

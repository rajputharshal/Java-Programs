package autowiringPack;

public class ByTypeObject {
	PojoClass pjj;
	public void setPjj(PojoClass pjj)
	{
		this.pjj=pjj;
		
	}
	public void showData()
	{
		System.out.println(pjj.getId() +pjj.getName()+pjj.getSal());
	}
	

}

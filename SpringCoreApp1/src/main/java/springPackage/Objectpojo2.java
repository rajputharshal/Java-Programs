package springPackage;

public class Objectpojo2 {
	 Objectpojo obj;
	public void setobj(Objectpojo obj)
	{
		this.obj=obj;
	}
	public void show()
	{
		System.out.println(obj.getId() + obj.getName() +obj.getSal());
	}

}

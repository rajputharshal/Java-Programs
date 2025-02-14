package pojo;
class emp
{
	private	int id;
	private String name;
	private long sali;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getSali() {
		return sali;
	}
	public void setSali(long sali) {
		this.sali = sali;
	}
	
}
class company
{
	emp e;
	void set(emp e)
	{
		this.e=e;
	}
	void show()
	{
		System.out.println(e.getId()  +  e.getName()  + e.getSali());
	}
}
public class employee 
{
	public static void main(String arg[])
	{
		emp e=new emp();
		e.setId(3);
		e.setName("ganesh");
		e.setSali(34353);
		 company c=new company();
		 c.set(e);
		 c.show();
	}
}

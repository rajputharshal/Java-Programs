package class_Object;

import java.util.Scanner;

class course
{
	private int id,codel;
	private String name;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCodel() {
		return codel;
	}
	public void setCodel(int codel) {
		this.codel = codel;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
class security
{
	course cr;
	int get(course cr)
	{
		this.cr=cr;
		
		if(cr.getCodel()==100)
		{
			return cr.getCodel();		
		}
		else
		{
			return -1;
		}
	}
}
public class encapsulation 
{
	public static void main(String argp[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id course id and name");
		int id=sc.nextInt(),
			code=sc.nextInt();
		String name=sc.next();
		course c=new course();
		c.setId(id);
		c.setCodel(code);
		c.setName(name);
		security s=new security();
		int result=s.get(c);
		if(result==100)
		{
			System.out.println("java");
		}
		else
		{
			System.out.println("not define");
		}
		
		
	}
}

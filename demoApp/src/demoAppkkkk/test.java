package demoAppkkkk;
import java.util.*;
class employee
{
	private int id;
	private String name;
	private int sal;
	void setid(int id)
	{
		this.id=id;
	}
	int getid()
	{
		return id;
	}
	void setname(String name)
	{
		this.name=name;
	}
	String getname()
	{
		return name;
	}
	void setsal(int sal)
	{
		this.sal=sal;
	}
	int getsal()
	{
		return sal;
	}

}
public class test {
public static void main(String args[])
{
	Vector v=new Vector();
	Scanner sc=new Scanner(System.in);

	System.out.println("total emp???");
	int size=sc.nextInt();
	for(int i=0;i<size;i++)
	{
		employee emp=new employee();
		
		System.out.println("enter id");
		int id=sc.nextInt();
		emp.setid(id);
		System.out.println("name");
		String name=sc.next();
		sc.nextLine();
		emp.setname(name);

		System.out.println("enter sal");
		int sal=sc.nextInt();
		emp.setsal(sal);
		
		v.add(emp);
	}
	
	for (Object obj : v) {
		
		employee e=(employee)obj;
		System.out.println(e.getid()+"\t"+e.getname()+"\t"+e.getsal());
	}
	
	
	System.out.println("enter deleting id");
	int id=sc.nextInt();

	boolean b=false;
	for(Object ob:v)//for(int i=0;i<size();i++)
	{
	   // Object obj=v.get(i);
		employee e=(employee)ob;

	
		if(e.getid()==id)
		{
			v.remove(e);
			b=true;
			break;
			
		    }
	}
	if(b)
	{
		for (Object obj1 : v) 
		{
			employee e1=(employee)obj1;
		
		System.out.println(e1.getid()+"\t"+e1.getname() + "\t"+e1.getsal());
		
		}
	}
	else
	{
		System.out.println("enter valid input");
	}
	

			
}
}

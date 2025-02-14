package wrapperclass;

import java.util.Scanner;
import java.util.Vector;

class employee
{
	private int id,sal;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
public class createEmployeeclass {

	public static void main(String[] args)
	{
		employee e[]=new employee[2];
		Vector v=new Vector();
		Scanner sc=new Scanner(System.in);
		int id,sal;
		String name;
		for(int i=0;i<e.length;i++)
		{
			e[i]=new employee();
			System.out.println("enter id name salary");
			e[i].setId(id=sc.nextInt());
			e[i].setName(name=sc.next());
			e[i].setSal(sal=sc.nextInt());
			v.add(e[i]);
		}
		//find employee logic and delete employee by id
		for(Object ob:v)
		{
			employee ee=(employee)ob;
			System.out.println(ee.getId() +ee.getName());
		}
		boolean flag=false;
		for(Object obj:v)
		{
			employee q=(employee)obj;
			if(q.getId()==2)
			{
				v.remove(q);
				flag=true;
				break;
			}
		}
		if(flag)
		{
			for (Object obj1 : v) 
			{
				employee a=(employee)obj1;
			
				System.out.println(a.getId()+"  "+a.getName()+ " "+a.getSal());
			
			}
		}
		else
		{
			System.out.println("enter valid input");
		}
	}

}

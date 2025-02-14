package wrapperclass;

import java.util.*;

class std
{
	
	int id ,sal;
	String name;
	std(int id, int sal,String name )
	{
		this.id=id;
		this.sal=sal;
		this.name=name;
	}
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
public class arraylistdemo {

	public static void main(String[] args) 
	{
		std o[]=new std[2];
		ArrayList a=new ArrayList();
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<o.length;i++)
		{
			 int id=sc.nextInt();
			 int sal=sc.nextInt();
			 String name=sc.next();
			 o[i]=new std(id,sal,name);
			 
//			 o[i].setId(id);
//			 o[i].setSal(sal);
//			 o[i].setName(name);
			 a.add(o[i]);
		}
//		for(int i=0;i<a.size();i++)
//		{
//			Object ob=a.get(i);
//			std sd=(std)ob;
//			System.out.println(sd.getId() + sd.getName());
//		}
//		for(Object ob:a)
//		{
//			std sd=(std)ob;
//			System.out.println(sd.getSal());
//		}
		for(Object ob:a)
		{
			std sd=(std)ob;
			
				System.out.println(sd.getName());
			
		}
	}

}

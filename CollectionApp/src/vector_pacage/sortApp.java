package vector_pacage;

import java.util.Scanner;
import java.util.Vector;
class Player
{
	private int id;
	private String name;
	private int run;
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
	void setrun(int sal)
	{
		this.run=run;
	}
	int getsal()
	{
		return run;
	}

}
public class sortApp 
{
	public static void main(String args[])
	{
		Vector v=new Vector();
		Scanner sc=new Scanner(System.in);

		
		
		
		
		
		System.out.println("total emp???");
		int size=sc.nextInt();
		for(int i=0;i<size;i++)
		{
			Player p=new Player();
			System.out.println("enter id");
			int id=sc.nextInt();
			System.out.println("enter name");
			String name=sc.next();
			System.out.println("enter run");
			int run=sc.nextInt();
			p.setid(id);
			p.setname(name);
			p.setrun(run);
			v.add(p);
		}
		for(int i=0;i<v.size();i++)
		{
			Object ob=v.get(i);
			Player p=(Player)ob;
			System.out.println(p.getid() + p.getname() +p.getsal());
		}
		
	}
}

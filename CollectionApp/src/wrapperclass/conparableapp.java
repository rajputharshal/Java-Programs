package wrapperclass;

import java.util.*;
import java.util.Scanner;

class stud implements Comparable<Object>
{
	

	private int id;
	private String name;

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

	public int compareTo(Object o)
	{
		stud s=(stud)o;
		if(this.id>s.id)
		{
			return 1;
		}
		else if(this.id<s.id)
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}

	
	
}

public class conparableapp {

	public static void main(String[] args) 
	{
		ArrayList<stud> l=new ArrayList<stud>();
		stud s[]=new stud[3];
		Scanner sc=new Scanner(System.in);
		int id;
		String name;
		for(int i=0;i<s.length;i++)
		{
			s[i]=new stud();
			System.out.println("enter id name");
			id=sc.nextInt();
			name=sc.next();
			s[i].setId(id);
			s[i].setName(name);
			l.add(s[i]);
			
		}
		for(Object o:l)
		{
			stud e=(stud)o;
			System.out.println(e.getId() +e.getName() );
		}
		Collections.sort(l);
		
		for(Object o:l)
		{
			stud e=(stud)o;
			System.out.println(e.getId() +e.getName() );
		}
		
	}

}

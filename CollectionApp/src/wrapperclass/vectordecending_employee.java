package wrapperclass;

import java.util.Scanner;
import java.util.Vector;

class emp
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
public class vectordecending_employee {

	public static void main(String[] args) {
		emp e[]=new emp[3];
		Scanner sc=new Scanner(System.in);
		int id,sal;
		String name;
		Vector v=new Vector();
		 for(int i=0;i<3;i++)
		 {
			 e[i]=new emp();
			 id=sc.nextInt();
			 name=sc.next();
			 sal=sc.nextInt();
			 
			 e[i].setId(id);
			 e[i].setName(name);
			 e[i].setSal(sal);
			 
			  v.add(e[i]);
		 }
		 for(int i=0;i<e.length;i++)
		 {
			 for(int j=i+1;j<e.length;j++)
			 {
				Object f=v.get(i);
				Object s=v.get(j);
				emp a=(emp)f;
				emp b=(emp)s;
				if(a.getId()>b.getId())
				{
					v.set(i,b);
					v.set(j,a);
				}
			 }
		 }
		 
		 for(Object o:v)
		 {
			 emp a=(emp)o;
			 System.out.println(a.getId() +a.getName() +a.getSal());
		 }
		
	}

}

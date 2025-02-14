package vector_pacage;
import java.util.*;
public class search_Employee 
{

	public static void main(String[] args)
	{
		employee emp[]=new employee[2];
		Vector <employee>v=new Vector<employee>();
		int i;
		Scanner sc=new Scanner(System.in);
		int id ,sal;
		String name;
		for(i=0;i<emp.length;i++)
		{
			emp[i]=new employee();
			
			System.out.println("id");
			id=sc.nextInt();
			
			System.out.println("name");
			name=sc.next();
			
			System.out.println("salary");
			sal=sc.nextInt();
			
			emp[i].setId(id);
			emp[i].setName(name);
			emp[i].setSal(sal);
			
			v.add(emp[i]);
			
		}
		for(i=0;i<v.size();i++)
		{
			Object ob=v.get(i);
			employee e=(employee)ob;
			if((e.getName()).equals("suraj"))
			{
				System.out.println(e.getId() +"  "+ e.getSal() +"  "+e.getName());
			}
		}
		for(Object ob:v)
		{
			employee e=(employee)ob;
			if(e.getId()==1)
			{
				System.out.println("found");
			}
		}
		
	}

}

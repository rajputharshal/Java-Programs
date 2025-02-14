package vector_pacage;
import java.util.*;
class employee
{
	protected int id,sal;
	protected String name;
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
public class save_employeedata {

	//private static final boolean Object = false;

	public static void main(String[] args) 
	{
		employee emp[]=new employee[2];
		Vector v=new Vector();
		int i;
		Scanner sc=new Scanner(System.in);
		int id,sal;
		String name;
		
		for( i=0;i<emp.length;i++)
		{
			emp[i]=new employee();
			id=sc.nextInt();
			name=sc.next();
			sal=sc.nextInt();
			
			emp[i].setId(id);
			emp[i].setName(name);
			emp[i].setId(sal);
			
			v.add(emp[i]);
		}
		
		
		for(Object ob:v)
		{
			employee em=(employee)ob;
			System.out.println(em.getId()+" "+ em. getName()+" "+em.getSal());
		}
	}

}

package ArrayObject;
import java.util.*;
class employee1
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
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	private int sal;

}
public class first_program {
	public static void mian(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		employee emp[]=new employee[5];
		for(int i=0;i<emp.length;i++)
		{
			int id=sc.nextInt(),sal=sc.nextInt();
			String name=sc.next();
			emp[i]=new employee();
			emp[i].setId(id);
			emp[i].setName(name);
			emp[i].setSal(sal);
		}
		for(int i=0;i<emp.length;i++)
		{
			System.out.println(emp[i].getId() + emp[i].getName() + emp[i].getSal());
		}
	}
}

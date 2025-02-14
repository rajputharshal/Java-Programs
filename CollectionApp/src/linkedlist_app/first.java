package linkedlist_app;
import java.util.*;
class Student
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
}
public class first {

	public static void main(String[] args) {
		LinkedList li=new LinkedList();
		Scanner sc=new Scanner(System.in);
		int id;
		String name;
		for(int i=0;i<3;i++)
		{
			Student sd=new Student();
			sd.setId(id=sc.nextInt());
			sd.setName(name=sc.next());
			li.add(sd);
		}
		
	}

}

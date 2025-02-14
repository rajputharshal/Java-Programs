package comparable_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class student implements Comparable<Object>
{
	int id,contact;
	String name;
	public student(int id, String name, int contact) {
		this.id=id;
		this.name=name;
		this.contact=contact;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getContact() {
		return contact;
	}
	public void setContact(int contact) {
		this.contact = contact;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int compareTo(Object o)
	{
		student s=(student) o;
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
public class comparable_app {
	public static void main(String[] args)
	{
		ArrayList<student> ar=new ArrayList<student>();
		
		int id,contact;
		String name;
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<3;i++)
		{
			System.out.println("id name contact");
			id=sc.nextInt();
			name=sc.next();
			contact=sc.nextInt();
			ar.add(new student(id,name,contact));
		
		}
		Collections.sort(ar);
		for(Object o:ar)
		{
			student st=(student)o;
			System.out.println(st.getId()+st.getName());
		}
		
	}
}

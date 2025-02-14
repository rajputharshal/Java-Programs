package LambdaExpresion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student
{
	int id,sal;
	String name;
	public Student(int id, int sal, String name) {
		this.id = id;
		this.sal = sal;
		this.name = name;	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", sal=" + sal + ", name=" + name + "]";
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
public class StudentApp {
	public static void main(String arg[])
	{
		Student s=new Student(4,20000,"harsh");
		Student s1=new Student(1,50000,"ram");
		Student s11=new Student(9,60000,"kana");
		List<Student> list=new ArrayList();
		list.add(s);
		list.add(s1);
		list.add(s11);
		System.out.println(list);
		Collections.sort(list,(a,b)->b.id-a.id);
		System.out.println(list);
	}

}

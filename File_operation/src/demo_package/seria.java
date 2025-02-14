package demo_package;

import java.io.*;
class emp implements Serializable
{
	int id;
	String name;
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
public class seria {

	public static void main(String[] args) throws Exception {
		FileOutputStream f=new FileOutputStream("D:\\FileHandlingHarsh");
		ObjectOutputStream o=new ObjectOutputStream(f);
		
		emp e=new emp();
		e.setId(1);
		e.setName("harsh");
		o.writeObject(e);
		o.close();
		System.out.println("done");
	}

	

	

}

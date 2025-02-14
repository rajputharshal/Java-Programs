package Serializable_DeSerializable;

import java.io.*;

class employee implements Serializable
{
	private int id,sal;
	private String name;
	void setId(int id)
	{
		this.id=id;
	}
	int getId()
	{
		return id;
	}
	void setName(String name)
	{
		this.name=name;
		
	}
	String getName()
	{
		return name;
	}
	void setSal(int sal) {
		this.sal=sal;
	}
	int getSal()
	{
		return sal;
	}
}
class Serializableapp
{
	public static void main(String arg[]) throws Exception
	{
		FileOutputStream stm=new FileOutputStream("D:\\mydrive.txt",true);
	
		ObjectOutputStream out=new ObjectOutputStream(stm);
		employee emp=new employee();
		emp.setId(1);
		emp.setName("harsh");
		emp.setSal(550000);
		out.writeObject(emp);
		out.close();
		System.out.println("done............");
		
//		 ObjectInputStream out1 = new ObjectInputStream(stm1);
//         Object ob=out1.readObject();
//         if (ob != null ) {
//             employee emp1 = (employee) ob;
//             System.out.println("ID: " + emp.getId());
//             System.out.println("Name: " + emp.getName());
//             System.out.println("Salary: " + emp.getSal());
//         } else {
//             System.out.println("Object not found or not of the expected type.");
//         }
//         out.close();
	}
}
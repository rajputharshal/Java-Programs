package demo_package;

import java.io.*;

public class de {
	public static void main(String arg[]) throws IOException, ClassNotFoundException
	{
		FileInputStream f=new FileInputStream("D:\\FileHandlingHarsh");
		ObjectInputStream o=new ObjectInputStream(f);
		emp e=(emp)o.readObject();
		int i=1;
		if(e!=null)
		{
			
			System.out.println(e.getId() + e.getName());
		}
	}

	

}

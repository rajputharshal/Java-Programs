package demo_package;
import java.io.*;
public class getAllFile {
	public static void main(String arg[])
	{
		File f=new File("D:\\program");
		File list[]=f.listFiles();
		for(int i=0;i<list.length;i++)
		{
			System.out.println(list[i]);
		}
		 for(int i=0;i<list.length;i++)
		 {
			 if(list[i].isDirectory())
			 {
				 System.out.println("=="+list[i]);
			 }
		 }
	}

}

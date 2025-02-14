package demo_package;
import java.io.*;
public class featchFile {
	public static void main(String arg[])
	{
		File f=new File("D:\\program");
		File list[]=f.listFiles();
		for(int i=0;i<list.length;i++)
		{
			if(list[i].isFile())
			{
				System.out.println(list[i]);
			}
			if(list[i].isDirectory())
			{
				System.out.println("=="+list[i]);
			}
		}
	}

}

package demo_package;

import java.io.*;

public class readClass {
	public static void main(String arg[]) throws IOException, InterruptedException
	{
		FileReader fr=new FileReader("D:\\FileHandlingHarsh");
		int data;
		while((data=fr.read())!=-1)
		{
			char ch=(char)data;
			System.out.print(ch);
			Thread.sleep(100);
		}
	}
}

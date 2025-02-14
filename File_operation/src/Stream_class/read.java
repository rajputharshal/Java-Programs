package Stream_class;

import java.io.*;

public class read 
{
	public static void main(String arg[]) throws Exception
	{
		FileInputStream is=new FileInputStream("D://mydrive.txt");
		int data;
		while((data=is.read())!=-1)
		{
			char ch=(char)data;
			Thread.sleep(300);
			System.out.print(ch);
		}
	}
}

package demo_package;

import java.io.File;
import java.io.IOException;

public class createFile {
	public static void main(String arg[]) throws Exception
	{
		File f=new File("D:\\GIRI'S TECH HUBE//harsh");
		boolean b=f.createNewFile();
		if(b)
		{
			System.out.println("succes");
		}
		else
		{
			System.out.println("faild");
		}
		
	}

}

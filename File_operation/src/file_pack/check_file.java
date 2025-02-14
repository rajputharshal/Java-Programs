package file_pack;
import java.io.*;
public class check_file {
	public static void main(String arg[])
	{
		File f=new File("D://program");
		File list[]=f.listFiles();
		for(int i=0;i<list.length;i++)
		{
			if(list[i].isFile())
			{
				System.out.println(list[i]);
			}
		}
	}

}

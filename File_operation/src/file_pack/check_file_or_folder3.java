package file_pack;
import java.io.*;
public class check_file_or_folder3
{
	public static void main(String arg[])
	{
		File f=new File("D:\\program");
		File list[]=f.listFiles();
		for(int i=0;i<list.length;i++)
		{
			System.out.println(list[i]);
		}
	}
}

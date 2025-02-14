package file_pack;
import java.io.*;
public class chech_folder {

	public static void main(String[] args) {
		File  f=new  File("D:/program");
		File list[]=f.listFiles();
		for(int i=0;i<list.length;i++)
		{
			if(list[i].isDirectory())
			{
				System.out.println(list[i]);
			}
		}
	}

}

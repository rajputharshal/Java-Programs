package file_pack;
import java.io.*;
public class Drive_memory1 
{
	public static void main(String arg[])
	{
		File f[]=File.listRoots();
		for(int i=0;i<f.length;i++)
		{
			long l1=f[i].getTotalSpace()/1073741824;
			long l2=f[i].getFreeSpace()/1073741824;
			System.out.println(f[i] +"total space \t"+l1+"\tfree space\t"+l2);
		}
		
	}
}

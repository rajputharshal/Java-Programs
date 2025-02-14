package demo_package;
import java.io.*;
public class drive_class {
	public static void main(String arg[])
	{
			File f[]=File.listRoots(); //this method  return array of file 
			for(int i=0;i<f.length;i++)
			{
				long total=(f[i].getTotalSpace()/1073741824);
				long free=(f[i].getFreeSpace())/1073741824;
				System.out.println(total+"=="+free);
			}
			
	}
}

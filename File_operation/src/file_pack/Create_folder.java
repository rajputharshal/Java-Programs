package file_pack;
import java.io.*;
public class Create_folder {

	public static void main(String[] args)
	{
		File f=new File("d");
		boolean b=f.exists();
		if(b)
		{
			System.out.println("aulredy exist");
		}
		else
		{
			boolean m=f.mkdir();
			if(m)
			{
				System.out.println("Susccesfully creates");
			}
			else
			{
				System.out.println("sonthing woring");
			}
		}
		File l[]= f.listFiles();
		for(int i=0;i<l.length;i++)
		{
			System.out.println(l[i]);
		}
	}
}

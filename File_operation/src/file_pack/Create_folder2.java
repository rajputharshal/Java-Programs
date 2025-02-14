package file_pack;
import java.io.*;
public class Create_folder2 {

	public static void main(String[] args)
	{
		File f=new File("d://filehandling");
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
	}
}

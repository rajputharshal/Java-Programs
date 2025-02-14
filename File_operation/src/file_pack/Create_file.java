package file_pack;
import java.io.*;
public class Create_file {
	public static void main(String arg[])throws Exception
	{
		File f=new File("D://idont_know");
		boolean b=f.createNewFile();
		if(b)
		{
			System.out.println("succesful");
		}
		else
		{
			System.out.println("faild");
		}
	}

}

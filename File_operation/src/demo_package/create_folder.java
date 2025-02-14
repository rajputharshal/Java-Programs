package demo_package;
import java.io.*;
public class create_folder {

	public static void main(String[] args) {
		File f=new File("d://demoFile");
		boolean b=f.exists();
		if(b)
		{
			System.out.println("file present");
		}
		else
		{
			boolean a=f.mkdir();
			if(a)
			{
				System.out.println("succesfully created");
			}
			else
			{
				System.out.println("somthing wrong");
			}
		}
	}

}

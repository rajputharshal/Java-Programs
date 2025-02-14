package demo_package;
import java.io.*;
public class streamwriter {
	public static void main(String arg[]) throws IOException
	{
		FileOutputStream f=new FileOutputStream("D:\\FileHandlingHarsh",true);
		String data="hello java";
		byte b[]=data.getBytes();
		f.write(b);
		f.close();
		System.out.println("done");
	}

}

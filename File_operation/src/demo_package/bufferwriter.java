package demo_package;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class bufferwriter {
	public static void main(String arg[])throws Exception
	{
		FileWriter f=new FileWriter("D:\\FileHandlingHarsh",true);
		BufferedWriter b=new BufferedWriter(f);
		String data="jagruti ........";
		b.write(data);
		b.newLine();
		b.close();
		f.close();
		System.out.println("done");
	}

}

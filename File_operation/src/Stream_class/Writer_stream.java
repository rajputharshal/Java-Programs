package Stream_class;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.*;

public class Writer_stream {

	public static void main(String[] args)throws Exception
	{	
		FileOutputStream fo=new FileOutputStream("D://mydrive.txt",true);
		String str=" hello java";
		byte b[]=str.getBytes();
		fo.write(b);
		fo.close();	
	}

}

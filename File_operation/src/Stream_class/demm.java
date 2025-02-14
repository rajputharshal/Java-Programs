package Stream_class;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class demm {

	public static void main(String[] args) {
		try
		{
			File f=new File("D://demo.txt");
			boolean b=f.exists();
			if(b)
			{
				FileWriter ff=new FileWriter(f,true);
				ff.write("\nhello java");
				ff.close();
				FileReader r=new FileReader(f);
				int data;
				while((data=r.read())!=-1)
				{
					char ch=(char)data;
					System.out.print(ch);
				}
			}
			else
			{
				f.createNewFile();
			}
		}
		catch(Exception ex)
		{
			
		}
	}

}

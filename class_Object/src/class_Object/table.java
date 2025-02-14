package class_Object;
import java.util.*;
class tables
{
	int no;
	void setno(int no)
	{
		this.no=no;
	}
	
	void result()
	{
		int i;
		for(i=1;i<=10;i++)
		{
			System.out.println(no*i);
		}
	}
}
public class table {
	
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		int no=10;
		tables t=new tables();
		t.setno(no);
		t.result();
		
	}

}

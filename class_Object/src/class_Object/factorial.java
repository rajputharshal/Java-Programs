package class_Object;
import java.util.*;
class fact
{
	int no;
	void setno(int no)
	{
		this.no=no;
	}
	int result()
	{
		int i,f=1;
		for(i=1;i<=no;i++)
		{
			f=f*i;
		}
		return f;
	}
	
}
public class factorial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		fact f=new fact();
		f.setno(no);
		System.out.println(f.result());

	}

}

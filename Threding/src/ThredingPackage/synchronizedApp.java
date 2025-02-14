package ThredingPackage;

import java.util.Scanner;

class AA
{
   synchronized	public void setTable(int x)
	{
		try
		{
			for(int i=1;i<10;i++)
			{
				System.out.println(i*x);
				if(i==5)
				{
					wait();
				}
				Thread.sleep(100);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		 
	}
   synchronized public void recall()
	{
		try
		{
			notifyAll();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
class BB extends Thread
{
	AA a;
	public void setval(AA a)
	{
		this.a=a;
	}
	public void run()
	{
		a.setTable(2);

	}
}
class CC extends Thread
{
	AA a;
	public void setval(AA a)
	{
		this.a=a;
	}
	public void run()
	{
		a.setTable(5);

	}
}
public class synchronizedApp {

	public static void main(String[] args) {
		AA a=new AA();
		 BB b=new BB();
		 b.setval(a);
		 b.start();
		 CC c=new CC();
		 c.setval(a);
		 c.start();
		 Scanner sc=new Scanner(System.in);
		 String str=sc.next();
		 if(str.equals("tt"))
		 {
			 a.recall();
		 }
		 
	}

}

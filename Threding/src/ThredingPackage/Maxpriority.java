package ThredingPackage;

class x extends Thread
{
	public  void run()
	{
		try
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println(i);
				Thread.sleep(500);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
class y extends Thread
{
 	public void run()
	{
		try
		{
			for(int i=11;i<=15;i++)
			{
				System.out.println(i);
				Thread.sleep(500);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

public class Maxpriority {

	public static void main(String[] args) {
		x xx=new x();
		xx.setPriority(Thread.MAX_PRIORITY);
		xx.start();
		
		y yy=new y();
		yy.setPriority(Thread.MIN_PRIORITY);
		yy.start();
	}

}

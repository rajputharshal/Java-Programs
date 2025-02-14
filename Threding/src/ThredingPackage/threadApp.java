package ThredingPackage;
class A extends Thread
{
	public void run()
	{
		try
		{
			for(int i=0;i<20;i++)
			{
				System.out.println("a="+i);
				Thread.sleep(1000);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
class B extends Thread
{
	public void run()
	{
		try
		{
			for(int i=0;i<20;i++)
			{
				System.out.println("b="+i);
				Thread.sleep(1000);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
}
public class threadApp {

	public static void main(String[] args) {

		A a=new A();
		a.start();
		B b=new B();
		b.start();
	}

}

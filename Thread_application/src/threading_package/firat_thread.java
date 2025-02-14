package threading_package;
import java.lang.*;
class first extends Thread
{
	public void run()
	{
		try
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println("t="+i + this.isAlive());
				
				if(i==3)
				{
					stop();
				}
				else
				{
					Thread.sleep(1000);
				}
			}
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}
}
class second extends Thread
{
	public void run() {
		try
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println("s="+i);
				Thread.sleep(1000);
			}
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}
}
public class firat_thread {

	public static void main(String[] args)throws InterruptedException
	{
		first f=new first();
		f.start();
		f.join();
		System.out.println(f.isAlive());
		second s=new second();
		s.start();
	}
}

package threading_package;
class table1
{
	
	synchronized void gettable(int n)
	{
		try
		{
			for(int i=1;i<=10;i++)
			{
				System.out.println(i*n);
				
				if(i==5)
				{
					wait();
				}
				else
				{
					Thread.sleep(100);
				}
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public synchronized void recall()
	{
		try
		{
			notifyAll();
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}
	
}
class a1 extends Thread
{
	table1 t;
	void set(table1 t)
	{
		this.t=t;
	}
	public void run()
	{
		t.gettable(2);
	}
	
}
class b1 extends Thread
{
	table1 t;
	void set(table1 t)
	{
		this.t=t;
	}
	public void run()
	{
		t.gettable(3);
	}
}
public class synchroniz_App{

	public static void main(String[] args) {
		
		table1 t=new table1();
		a1 aa=new a1();
		aa.set(t);
		aa.start();
		b1 bb=new b1();
		bb.set(t);
		bb.start();
		do
		{
			java.util.Scanner sc=new java.util.Scanner(System.in);
			String s=sc.next();
			if(s.equals("res"))
			{
				t.recall();
			}
		}
		while(true);
	}

}

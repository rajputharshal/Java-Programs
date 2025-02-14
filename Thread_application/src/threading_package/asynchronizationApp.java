package threading_package;
class table
{
	
	void gettable(int n)
	{
		try
		{
			for(int i=1;i<=10;i++)
			{
				System.out.println(i*n);
				Thread.sleep(1000);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
}
class a extends Thread
{
	table t;
	void set(table t)
	{
		this.t=t;
	}
	public void run()
	{
		t.gettable(2);
	}
}
class b extends Thread
{
	table t;
	void set(table t)
	{
		this.t=t;
	}
	public void run()
	{
		t.gettable(3);
	}
}
public class asynchronizationApp {

	public static void main(String[] args) {
		
		table t=new table();
		a aa=new a();
		aa.set(t);
		aa.start();
		b bb=new b();
		bb.set(t);
		bb.start();

	}

}

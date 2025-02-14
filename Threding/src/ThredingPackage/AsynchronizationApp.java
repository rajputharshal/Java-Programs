package ThredingPackage;

class Table
{
	void showtable(int x)
	{
		try
		{
			for(int i=1;i<=10;i++)
			{
				System.out.println(i*x);
				Thread.sleep(100);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
class one  extends Thread
{
	Table table;
	void setval(Table table)
	{
		this.table=table;
	}
	public void run()
	{
		table.showtable(2);
	}
	
}
class two extends Thread
{
	Table table;
	void setval(Table table)
	{
		this.table=table;
	}
	public void run()
	{
		table.showtable(3);
	}
}
public class AsynchronizationApp {

	public static void main(String[] args) {
		Table t=new Table();
		one o=new one();
		o.setval(t);
		o.start();
		
		two tt=new two();
		tt.setval(t);
		tt.start();
	}

}

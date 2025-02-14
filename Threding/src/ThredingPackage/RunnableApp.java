package ThredingPackage;
class p implements Runnable
{

	@Override
	public void run() {
		try
		{
			for(int i=0;i<=5;i++)
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
public class RunnableApp {

	public static void main(String[] args) {
		p pp=new p();
		Thread t=new Thread(pp);
		t.start();
		
		
	
		Runnable r=new Runnable() {
			
			@Override
			public void run() {
				for(int i=1; i<10;i++)
				{
					System.out.println(i);
				}	
			}
		};
		Thread tt=new Thread(r);
		tt.start();
			
		}

	}



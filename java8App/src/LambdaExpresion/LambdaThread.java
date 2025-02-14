package LambdaExpresion;
@FunctionalInterface
interface lambda extends Runnable
{
	public void run();
}
public class LambdaThread {

	public static void main(String[] args) {
		Runnable r=()->{
			for(int i=0;i<=10;i++)
			{
				System.out.println(i);
			}
		};
		Thread t=new Thread(r);
		r.run();
	}

}

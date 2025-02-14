package constructor;
class utilapp
{
	private utilapp()
	{
		System.out.println("hrllo");
	}
	public static void demo()
	{
		System.out.print("demo");
		utilapp i=new utilapp();
	}
}

public class utilityClass {

	public static void main(String[] args) {
		utilapp.demo();
		
	}

}

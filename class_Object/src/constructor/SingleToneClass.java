package constructor;
class demo
{
	public static demo d=null;
	private demo()
	{
		System.out.println("im single tone constructor");
	}
	public static demo get()
	{
		if(d==null)
		{
			d=new demo();
		}
		return d;
	}
}
public class SingleToneClass {
	public static void main(String[] args) {
	demo.get();
	}

}

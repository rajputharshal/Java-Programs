package constructor;
class util
{
	private util()
	{
		System.out.println("hello");
	}
	public static void show()
	{
		System.out.println("im show");
	}
}
public class util_class {

	public static void main(String[] args)
	{
		util.show();
	}

}

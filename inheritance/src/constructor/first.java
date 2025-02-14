package constructor;
class parent
{
	parent()
	{
		System.out.println("parent");
	}
}
class child extends parent
{
	child( )
	{
		
		System.out.println("child constructor");
	}
}
public class first {
	public static void main(String arg[])
	{
		child c=new child();

	}
}

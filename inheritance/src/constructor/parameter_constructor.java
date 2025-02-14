package constructor;
class parent1
{
	parent1()
	{
		System.out.println("=======parent");
	}
}
class child1 extends parent1
{
	child1(int b)
	{
		
		System.out.println("child constructor");
	}
}
public class parameter_constructor 
{
	public static void main(String arg[])
	{
		child1 c=new child1(4);
	}
}

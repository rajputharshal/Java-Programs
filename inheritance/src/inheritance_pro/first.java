package inheritance_pro;

class parent 
{
	void get()
	{
		System.out.println("parent");
	}
}
class child extends parent
{
	void getchild()
	{
		System.out.println("child");
	}
}
public class first {
	public static void main(String arg[])
	{
		child c=new child();
		c.get();
		c.getchild();
	}
}

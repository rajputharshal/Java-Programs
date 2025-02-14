package demoPackage;
import java.util.*;
public class ListIterator_add 
{
	public static void main(String arg[])
	{
		Vector v=new Vector();
		v.add(35);
		v.add(45);
		v.add(30);	
		v.add(50);
		v.add(40);
		v.add(10);
		ListIterator lr=v.listIterator();
	
		while(lr.hasNext())
		{
		
			Object ob=lr.next();
			if((int)ob==40)
			{
				lr.remove();
			}
		}
		
		for(Object ob:v)
		{
			System.out.println(ob);
		}
		
	}
}

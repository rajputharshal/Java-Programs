package demoPackage;
import java.util.*;
public class ListIteratorApp
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
		ListIterator lr=v.listIterator(v.size());
		while(lr.hasPrevious())
		{
			Object ob=lr.previous();System.out.println(ob);
			
		}
		v.sort(null);
		ListIterator l=v.listIterator();
		while(l.hasNext())
		{
			Object ob=l.next();
			System.out.println(ob);

		}
				
	}
}

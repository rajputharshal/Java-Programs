package ArrayList_pack;

import java.util.ArrayList;
import java.util.ListIterator;

public class listIterator {
	public static void main(String  arg[])
	{
		ArrayList a=new ArrayList();
		a.add(23);
		a.add(35);
		a.add(345);
		a.add(45);
		a.add(23);
		a.add(35);
		a.add(345);
		a.add(45);
		ListIterator l=a.listIterator();
		while(l.hasNext())
		{
			Object o=l.next();
			System.out.println(o);
			if((int)o==45)
			{
				l.add(0);
			}
		}
		System.out.println(a);
	}

}

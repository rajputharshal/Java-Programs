package ArrayList_pack;

import java.util.ArrayList;
import java.util.Iterator;
public class remove
{
	public static void main(String arg[])
	{
		ArrayList a=new ArrayList();
		a.add(23);
		a.add(35);
		a.add(345);
		a.add(45);
		a.add(321);
		Iterator i=a.iterator();
		while(i.hasNext())
		{
			Object o=i.next();
			System.out.println(o);
		}
		boolean b=a.isEmpty();
		if(b)
		{
			System.out.println("is empty");
		}
		else
		{
			System.out.println("not empty");
		}
//		Object o[]=a.toArray();
//		for(int x=0;x<o.length;x++)
//		{
//			System.out.println("=="+o[x]);
//		}
		
		a.remove(1);
		System.out.println(a);
		
		
	}
}

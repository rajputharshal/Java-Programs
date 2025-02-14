package wrapperclass;

import java.util.ArrayList;
import java.util.*;

public class collection_class {
	public static void main(String arg[])
	{
		ArrayList l=new ArrayList();
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(60);
		Iterator i=l.iterator();
		while(i.hasNext()) {
			Object ob=i.next();
			System.out.println(ob);
		}
		ArrayList a=new ArrayList();
		a.add(40);
		a.add(60);
		boolean c=l.containsAll(a);
		
		if(c)
		{
			System.out.println("zal");
		}
		else
		{
			System.out.println("nahi zal");
		}
	}

}

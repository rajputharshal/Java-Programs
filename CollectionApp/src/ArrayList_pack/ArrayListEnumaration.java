package ArrayList_pack;

import java.util.ArrayList;
import java.util.Iterator;
//import java.util.Iterator;
public class ArrayListEnumaration {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(5);
		a.add(8);
		a.add(6);
		a.add(1);
		a.add(9);
		a.add(7);
		a.add(4);
		
		//Enumeration e=a.elements();
		Iterator i=a.iterator();
		while(i.hasNext())
		{
			Object o=i.next();
			System.out.println((int)o);
			if((int)o==1)
			{
				i.remove();
			}
		}
		System.out.println(a);

		
	}

}

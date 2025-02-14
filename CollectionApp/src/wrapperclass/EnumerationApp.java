package wrapperclass;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class EnumerationApp {

	public static void main(String[] args) {
		Vector v=new Vector();
		v.add(20);
		v.add(3);
		v.add(46);
		v.add(35);
		 Enumeration e=v.elements();
		 while(e.hasMoreElements())
		 {
			 Object o=e.nextElement();
			 System.out.println(o);
		 }
		 
		 Iterator i=v.iterator();
		 while(i.hasNext())
		 {
			 Object o=i.next();
			 if((int)o==35)
			 {
				 i.remove();
			 }
		 }
		 System.out.println(v);
	}

}

package collections_pack;

import java.util.ArrayList;
import java.util.Collections;

public class colleactionpro {
	public static void main(String arg[])
	{
		ArrayList al = new ArrayList();
		 al.add(50);
		 al.add(20);
		 al.add(10);
		 al.add(220);
		 al.add(34);
		 al.add(180);
		 al.add(45);
		 System.out.println("Before Sort");
		 for(Object obj:al) {
			 System.out.print("  "+obj);
		 }
		 System.out.println();
		 Collections.sort(al);
		 for(Object obj:al) {
			 System.out.print("  "+obj);
		 }
		 int max=(int)Collections.max(al);
		 System.out.println("max="+max);
	}

}

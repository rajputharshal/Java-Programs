package wrapperclass;

import java.util.Vector;

public class vector_method_app {

	public static void main(String[] args) {
		
		Vector v=new Vector(5,4);
		int c=v.capacity();
		System.out.println(c);
		 v.add(100);
		 v.add(200);
		 v.add(300);
		 v.add(100);
		 v.add(200);
		 v.add(300);
		 v.add(100);
		 v.add(200);
		 v.add(300);
		 v.add(100);
		 v.add(200);
		
		 System.out.println(v);
		 int second=v.capacity()
;
		 System.out.println(v.size());
		 System.out.println(second);
		 }

}

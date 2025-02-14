package ArrayList_pack;

import java.util.ArrayList;
import java.util.Collections;

public class firstProgram {

	public static void main(String[] args) {
		ArrayList v=new ArrayList();
		v.add(1011);
		 v.add(20);
		 v.add(30);
		 v.add(11);
		 v.add(22);
		 v.add(33);
		 v.add(21);
		 v.add(304);
		 Collections.sort(v);
		 for(Object o:v)
		 {
			 System.out.println(o);
		 }
		 System.out.println(v);
		
	}

}

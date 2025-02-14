package demoPackage;

import java.util.*;

public class enumaration_fatch {

	public static void main(String[] args) {
		Vector v=new Vector();
		v.add(35);
		v.add(45);
		v.add(30);	
		v.add(50);
		v.add(40);
		Enumeration en=v.elements();
		while(en.hasMoreElements())
		{
			Object ob=en.nextElement();
			System.out.println(ob);
		}
	}

}

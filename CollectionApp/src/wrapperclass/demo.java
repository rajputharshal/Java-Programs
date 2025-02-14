package wrapperclass;
import java.util.*;

import demoPackage.enumaration_fatch;
public class demo {

	public static void main(String[] args) {
	
		
		//HashSet v=new HashSet();
		TreeSet v=new TreeSet();
		v.add(11);
		v.add(2);
		v.add(51);
		v.add(1);
		v.add(91);
		NavigableSet n=v.descendingSet();
		for(Object o:n)
		{
			System.out.println(o);
		}

	}

}

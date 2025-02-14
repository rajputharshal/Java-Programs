package wrapperclass;

import java.util.*;
import java.util.Vector;

public class vectorFoor_maxElement {

	public static void main(String[] args) {
		Vector v=new Vector();	
		v.add(45);
		v.add(2);
		v.add(65);
		v.add(23);
		v.add(9);
	
		int max=(int)v.get(0);
		for(int i=0;i<v.size();i++)
		{
			Object o=v.get(i);
			if((int)o>max)
			{
				max=(int)o;
			}
		}
		System.out.println(max);
	}

}

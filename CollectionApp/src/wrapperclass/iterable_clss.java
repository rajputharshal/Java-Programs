package wrapperclass;

import java.util.ArrayList;
import java.util.Iterator;

public class iterable_clss {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(10);
		a.add(45);
		a.add(30);
		a.add(40);
		Iterator i=a.iterator();
		while(i.hasNext()) {
			Object ob=i.next();
			System.out.println(ob);
		}
		int size=a.size();
		System.out.println("size of="+size);
		boolean emp=a.isEmpty();
		if(emp)
		{
			System.out.println("is empty");
		}
		else
		{
			System.out.println("not empt");
		}
		
		boolean find=a.contains(30);
		if(find)
		{
			System.out.println("element is found");
		}
		else
		{
			System.out.println("element is not found");
		}
		
		Object ob[]=a.toArray();
		for(int i1=0;i1<a.size();i1++)
		{
			System.out.println("ob="+ob[i1]);
		}
		
		
		
	}

}

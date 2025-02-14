package wrapperclass;

import java.util.Vector;

public class fatchfoor {

	public static void main(String[] args) 
	{
	Vector v=new Vector();	
	v.add(45);
	v.add(2);
	v.add(65);
	v.add(23);
	v.add(9);
	int sum = 0;
	 	for(int i=0;i<v.size();i++)
	 	{
	 		Object o=v.get(i);
	 		System.out.println("=="+o);
	 		sum+=(int)o;
	 	}
	 	System.out.println("sum of vector"+sum);
	}

}

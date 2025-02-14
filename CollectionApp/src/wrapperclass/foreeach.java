package wrapperclass;

import java.util.Vector;

public class foreeach {

	public static void main(String[] args) {
		Vector v=new Vector();
		v.add(35);
		v.add(45);
		v.add(30);	
		v.add(50);
		v.add(40);
		v.add(10);
		for(Object o:v)
		{
			System.out.println(o);
		}
		
		int a[]= {46,3,56,8,3,46,3};
		for(int i:a)
		{
			System.out.println(i);
		}
	}

}

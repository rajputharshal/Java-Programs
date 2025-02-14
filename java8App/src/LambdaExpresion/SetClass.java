package LambdaExpresion;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetClass {
	public static void main(String arg[])
	{
		Set<Integer> s=new  TreeSet<Integer>((a,b)->b-a);//desending order
		
		s.add(3);
		s.add(4);
		s.add(2);
		s.add(1);
		s.add(8);
		System.out.println(s);
		
		List<Integer> list=new ArrayList<Integer>();

	}

}

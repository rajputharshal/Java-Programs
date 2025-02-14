package hashset_pack;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class hashsetInput {
	public static void main(String[] args)
	{
		ArrayList hs=new ArrayList();
		hs.add(10);
		hs.add(1000);
		hs.add(200);
		hs.add(235);
		hs.add(400);
		hs.add(45);
		hs.add(22);
		hs.add(200);
		for(Object o:hs)
		{
			System.out.print("  "+o);
		}
		System.out.println();
		HashSet h=new HashSet(hs);
		for(Object o:h)
		{
			System.out.print("  "+o);
		}
		System.out.println();
		LinkedHashSet li=new LinkedHashSet(hs);
		for(Object o:li)
		{
			System.out.print("  "+o);
		}
		System.out.println();
		TreeSet ts=new TreeSet(hs);
		for(Object o:ts)
		{
			System.out.print("  " +o);
		}
		

	}

}

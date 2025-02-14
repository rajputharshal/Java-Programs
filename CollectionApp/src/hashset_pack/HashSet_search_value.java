package hashset_pack;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.NavigableSet;
import java.util.TreeSet;

public class HashSet_search_value {

	public static void main(String[] args) {
		HashSet<Integer> hs=new HashSet<Integer>();
		hs.add(10);
		hs.add(1000);
		hs.add(200);
		hs.add(235);
		hs.add(400);
		hs.add(45);
		hs.add(22);
		hs.add(200);
		
		if(hs.contains(10000))
		{
			System.out.println("found");
		}
		else
		{
			System.out.println("not");
		}
		List li=new ArrayList(hs);
		int ind=li.indexOf(10);
		System.out.println("index="+ind);
		TreeSet ts=new TreeSet();
		NavigableSet n=ts.descendingSet();
		Iterator  i = n.iterator();
		while(i.hasNext()) {
			Object obj=i.next();
			System.out.println(obj);
		}

	}

}

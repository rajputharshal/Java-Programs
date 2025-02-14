package MapAppPack;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Exerscies {

	public static void main(String[] args) {
		LinkedHashMap<Integer,String> map=new LinkedHashMap<Integer, String>();
		
		if(map.isEmpty())
		{
			map.put(1, "harsh");
			map.put(2,"ram");
			map.put(3,"bramha");
			map.put(4,"mahesha");
		}
		int size=map.size();
//		System.out.println(size);
//		System.out.println(map.get(2)=="ram");
//		boolean b=map.containsKey(2);
//		if(b)
//		{
//			System.out.println("present");
//		}
//		else
//		{
//			System.out.println("not ");
//		}
		//Set<Integer> keys=map.keySet();
		Set<Entry<Integer, String>>s=map.entrySet();
		for(Entry<Integer,String> m:s)
		{
			Object o=map.get(s);
			System.out.println(m.getKey() + m.getValue());
			
		}
		
//		Collection c=map.values();
//		Iterator i=c.iterator();
//		while(i.hasNext())
//		{
//			Object o=i.next();
//			System.out.println(o);
//					
//		}
	}

}

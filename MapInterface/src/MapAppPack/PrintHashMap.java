package MapAppPack;

import java.util.*;
import java.util.Set;
import java.util.Map.Entry;

public class PrintHashMap {

	public static void main(String[] args) {
		HashMap map=new HashMap();
		map.put(1, "ABC");
		map.put(2, "MNO");
		map.put(3, "STV");
		map.put(4, "XYZ");
		map.put(5, "SSSS");
		map.put(6, "TTTTT");
		Set<Map.Entry<Integer,String>> s=map.entrySet();
		for(Map.Entry<Integer,String> m:s)
		{
			System.out.println(m.getKey()+m.getValue());
		}
		LinkedHashMap l=new LinkedHashMap(map);
		Set<Map.Entry<Integer,String>> ls=l.entrySet();
		for(Map.Entry<Integer,String> m:ls)
		{
			System.out.println(m.getKey()+m.getValue());
		}

	}

}

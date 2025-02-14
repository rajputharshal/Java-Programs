package springPackage;

import java.util.*;

public class mappojo {
	Map name;
	public void setname(Map<Integer,String>name)
	{
		this.name=name;
	}
	public void show()
	{
		Set<Map.Entry<Integer,String>>entry=name.entrySet();
		for(Map.Entry<Integer,String> e:entry)
		{
			System.out.println(e.getValue() + e.getKey());
		}
	}

}

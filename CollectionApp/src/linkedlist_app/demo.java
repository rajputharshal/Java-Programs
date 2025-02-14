package linkedlist_app;
import java.util.*;
public class demo {
	public static void main(String arg[])
	{
		ArrayList list=new ArrayList();
		list.add(3);
		list.add(3);
		list.add(45);
		Iterator it=list.iterator();
		while(it.hasNext())
		{
			Object ob=it.next();
			System.out.println(ob);
		}
		int size=list.size();
		System.out.println(size);
		boolean b=list.isEmpty();
		if(b)
		{
			System.out.println("empty");
		}
		else
		{
			System.out.println("not empty");
		}
		boolean b1=list.contains(3);
		if(b1)
		{
			System.out.println("present");
		}
		else
		{
			System.out.println("not present");
		}
		Object obj[]=list.toArray();
		for(int i=0;i<obj.length;i++)
		{
			System.out.println(obj[i]);
		}
	}
}

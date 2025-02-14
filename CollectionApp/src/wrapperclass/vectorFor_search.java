package wrapperclass;

import java.util.*;

public class vectorFor_search {

	public static void main(String[] args) {
		Vector v=new Vector();	
		v.add(45);
		v.add(2);
		v.add(65);
		v.add(23);
		v.add(9);
		
//		boolean c=v.contains(65);
//		if(c)
//		{
//			System.out.println("present");
//		}
//		else
//		{
//			System.out.println("absent");
		//}
		
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		for(int i=0;i<v.size();i++)
		{
			Object o=v.get(i);
			if(no==(int)o)
			{
				System.out.println("found");
				break;
			}
			
		}
	}

}

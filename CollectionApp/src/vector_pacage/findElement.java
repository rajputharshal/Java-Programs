package vector_pacage;

import java.util.Vector;

public class findElement {

	public static void main(String[] args) {
		Vector v=new Vector();
		v.add(35);
		v.add(45);
		v.add(30);	
		v.add(50);
		v.add(40);
//		boolean b=v.contains(30);
//		if(b)
//		{
//			System.out.println("element found");
//		}
//		else
//		{
//			System.out.println("not found");
//		}
		int no=40,i;
		for(i=0;i<v.size();i++)
		{
			Object ob=v.get(i);
			if(no==(int)ob)
			{
				System.out.println(" found");
				break;
			}
			
		}
	}

}

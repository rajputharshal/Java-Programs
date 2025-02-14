package ArrayList_pack;


import java.util.ArrayList;

public class arrayListApp {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		
		a.add(23);
		a.add(35);
		a.add(345);
		a.add(45);
		boolean b=a.contains(395);
//		if(b)
//		{
//			System.out.println("no is here");
//		}
//		else
//		{
//			System.out.println("no is not here");
//		}
		boolean f=false;
		for(int i=0;i<a.size();i++)
		{
			Object o=a.get(i);
			if(325==(int)o)
			{
				f=true;
				break;
			}
			else
			{
				f=false;
			}
		}
		if(f)
		{
			System.out.println("here");
		}
		else
		{
			System.out.println("not ");
		}
	}

}

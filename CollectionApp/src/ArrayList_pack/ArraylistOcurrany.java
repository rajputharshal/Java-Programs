package ArrayList_pack;

import java.util.ArrayList;

public class ArraylistOcurrany {

	public static void main(String[] args) {
		ArrayList v=new ArrayList();
		v.add(100);
		 v.add(200);
		 v.add(300);
		 v.add(100);
		 v.add(200);
		 v.add(300);
		 v.add(100);
		 v.add(200);
		 v.add(300);
		 v.add(100);
		 v.add(200);
		 
		
		 for(int i=0;i<v.size();i++)
		 {
			 int count=1;
			for(int j=i+1;j<v.size();j++)
			{
				if((int)v.get(i)==(int)v.get(j))
				{
					++count;
					v.set(j,0);
				}
			}
			if((int)v.get(i)!=0)
			{
				System.out.println(v.get(i)+  "  "+ count);
			}
		 }
		 
	}

}

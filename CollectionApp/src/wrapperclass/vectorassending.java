
package wrapperclass;

import java.util.Vector;

public class vectorassending {

	public static void main(String[] args) {
		Vector v=new Vector();
		v.add(20);
		v.add(3);
		v.add(46);
		v.add(35);
		
		 for(int i=0;i<v.size();i++)
		 {
			 for(int j=i+1;j<v.size();j++)
			 {
				 if((int)v.get(i)>(int)v.get(j))
				 {
					 Object f=v.get(i);
					 Object s=v.get(j);
					if((int)f>(int)s)
					{
						v.set(i,s);
						v.set(j, f);
					}
				 }
			 }
		 }
		System.out.println(v);
	}

}

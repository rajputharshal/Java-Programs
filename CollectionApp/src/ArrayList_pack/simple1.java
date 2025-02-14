package ArrayList_pack;
import java.util.ArrayList;
import java.util.Collection;
public class simple1 {

	public static void main(String[] args) {
		ArrayList v=new ArrayList();
		v.add(1011);
		 v.add(20);
		 v.add(30);
		 v.add(11);
		 v.add(22);
		 v.add(33);
		 v.add(21);
		 v.add(304);
		 v.add(100);
		 v.add(200);
//		 int i;
//		 for( i=0;i<v.size();i++)
//		 {
//			 Object o=v.get(i);
//			 System.out.println(o);
//			 
//		 }
//		 //sum
//		 int sum=0;
//		 for( i=0;i<v.size();i++)
//		 {
//			 Object o=v.get(i);
//			 sum+=(int)o; 
//		 }
//		 System.out.println("sum=="+sum);
//		 
//		 //max
//		 int max=(int)v.get(0);
//		 for(i=0;i<v.size();i++)
//		 {
//			 Object o=v.get(i);
//			 if(max<(int)o)
//			 {
//				 max=(int)o;
//			 }
//		 }
//		 System.out.println("max="+ max);
//		sorting/////////////////////////////
//		 for(int i=0;i<v.size();i++)
//		 {
//			 for(int j=i+1;j<v.size();j++)
//			{
//				Object f=v.get(i);
//				Object s=v.get(j);
//				if((int)f>(int)s)
//				{
//					v.set(i, s);
//					v.set(j, f);
//				}
//			}
//		 }
//		 System.out.println(v);
		 
		 
		 //find max
		 int max=(int)v.get(0);
		 for(int i=0;i<v.size();i++)
		 {
			 if(max<(int)v.get(i))
			 {
				 max=(int)v.get(i);
			 }
		 }
		 System.out.println(max);
		 
	}

}

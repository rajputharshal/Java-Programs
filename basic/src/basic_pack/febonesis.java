package basic_pack;

public class febonesis {

	public static void main(String[] args) {
		// 1 1 2 3 5 8 13
		int n1=0,n2=1,n;
		System.out.println(n2+"\t");
		int sum=0;
		for(int i=1;i<10;i++)
		{
			n=n1+n2;
			System.out.println(n);
			n1=n2;
			n2=n;
			 
		}
	}

}

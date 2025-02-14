package wrapper_program1;

public class reverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abcd";
		char[] c=s.toCharArray();
		int i;
		for(i=0;i<c.length;i++)
		{
			System.out.print(" "+c[i]);
		}
		int len=c.length-1;
		int mid=c.length/2;
		
		for(i=0;i<mid;i++)
		{
			char temp=c[i];
			c[i]=c[len];
			c[len]=temp;
			--len;
		}
		
		
		System.out.println();
		for(i=0;i<c.length;i++)
		{
			System.out.print(" "+c[i]);
		}
		
	}

}

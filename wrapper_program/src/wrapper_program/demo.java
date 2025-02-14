package wrapper_program;

public class demo {

	public static void main(String[] args) {
	String s="good";
	  char ch[]=s.toCharArray();
	  int len=ch.length-1;
	  int mid=ch.length/2;
	 
	  for(int i=0;i<mid;i++)
	  {
		  char temp=ch[i];
		  ch[i]=ch[len];
		  ch[len]=temp;
		  --len; 
	  }
	 for(int i=0;i<ch.length;i++)
	 {
		System.out.print(ch[i]); 
	 }
	  

	}
}

package constructor;
class rectangle
{
	int len,bth;
	rectangle()
	{
		len=0;
		bth=0;
		System.out.println("result="+len*bth);
	}
	rectangle(int len)
	{
		this.len=len;
		this.bth=4;
		System.out.println("result="+len*bth);
	}
	rectangle(int len,int bth)
	{
		this.len=len;
		this.bth=bth;
		System.out.println("result="+len*bth);
	}
	
}
public class rectangeApp {

	public static void main(String[] args) 
	{
		rectangle tr=new rectangle();
	
		rectangle tr1=new rectangle(4);
	
		rectangle tr2=new rectangle(4,5);
		
		
		
	}

}

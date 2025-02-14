package functionPack;

public class FuctionRecursion {

	public static int table(int no) {
		if(no==0)
		{
			return 0;
		}

		System.out.println(no);
		return table(no--);
	}
	
public static void main(String[] args) {
	System.out.println(table(5));
	
	
}
	
}

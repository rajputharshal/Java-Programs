package comparable_comparator;

import java.util.Comparator;

public class compare_by_price implements Comparator {
	
	
	public int compare(Object o1, Object o2) {
		product p=(product)o1;
		product pp=(product)o2;
		if(p.getPrice()>pp.getPrice())
		{
			return 1;
		}
		else if(p.getPrice()<pp.getPrice())
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}



}

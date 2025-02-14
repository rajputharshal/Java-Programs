package comparable_comparator;

import java.util.Comparator;

public class compare_by_id implements Comparator
{

	
	public int compare(Object o1, Object o2) {
		product p=(product)o1;
		product pp=(product)o2;
		if(p.getId()>pp.getId())
		{
			return 1;
		}
		else if(p.getId()<pp.getId())
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}



}

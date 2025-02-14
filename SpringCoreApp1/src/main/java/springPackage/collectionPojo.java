package springPackage;

import java.util.List;

public class collectionPojo {
	List name;
	public void setname(List name)
	{
		this.name=name;
		
	}
	public void show()
	{
		for(int i=0;i<name.size();i++)
		{
			Object o=name.get(i);
			System.out.println(o);
		}
	}
	

}

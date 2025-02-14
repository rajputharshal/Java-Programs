package comparable_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class product 
{
	int id,price;
	String name;
	public product(int id2, int price2, String name2)
	{
		id=id2;
		price=price2;
		name=name2;
	}
	
	public product() {
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


	
}
public class comparator_app {

	public static void main(String[] args) 
	{
		ArrayList<product> ar=new ArrayList<product>();
		
		int id,price;
		String name;
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<3;i++)
		{
			System.out.println("id price name");
			id=sc.nextInt();
			price=sc.nextInt();
			name=sc.next();
			ar.add(new product(id,price,name));
		}
		do
		{
		System.out.println("1. by price"
							+ "2.by id");
		
		
			int choise=sc.nextInt();
			switch(choise)
			{
			case 1:
				compare_by_price cp=new compare_by_price();
				Collections.sort(ar,cp);
				for(Object q:ar)
				{
					product p=(product)q;
					System.out.println(p.getId()+"\t"+ p.getName()+"\t"+p.getPrice());
				}
				break;
			case 2:
				compare_by_id ci=new compare_by_id();
				Collections.sort(ar,ci);
				for(Object q:ar)
				{
					product p=(product)q;
					System.out.println(p.getId()+"\t"+ p.getName()+"\t"+p.getPrice());
				}
				break;
			default:
				System.out.println("enter valid number");
			}
			
		}while(true);
		
	}

}

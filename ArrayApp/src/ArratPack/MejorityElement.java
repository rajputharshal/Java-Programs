package ArratPack;

public class MejorityElement {

	public static void main(String[] args) {
		int a[]={2,3,3,6,3,7,2,8,3,3};
		int count=1;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j]&&a[i]!=0)
				{
					count++;
					a[j]=0;
				}
			}
			if(count>a.length/2)
			{
				System.out.println(a[i]+" is mejority element");
				break;
			}
						
		}
	}

}

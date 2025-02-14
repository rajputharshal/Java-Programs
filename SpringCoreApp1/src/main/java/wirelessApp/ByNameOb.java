package wirelessApp;

public class ByNameOb {
	private ByNamePojo bn;
	public void setbn(ByNamePojo bn)
	{
		this.bn=bn;
	}
	public void getData() {
	    System.out.println(bn.getId() + " " + bn.getName() + " " + bn.getSal());
	}


}

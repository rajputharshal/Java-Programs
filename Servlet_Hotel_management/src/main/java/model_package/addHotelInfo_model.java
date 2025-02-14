package model_package;

public class addHotelInfo_model extends addHotel_model{
	@Override
	public String toString() {
		return "addHotelInfo_model [Iid=" + Iid + ", Contact=" + Contact + ", Email=" + Email + ", location=" + location
				+ ", Address=" + Address + "]";
	}
	private int Iid,Contact;
	private String Email,location,Address;

	public int getIid() {
		return Iid;
	}
	public void setIid(int ifId) {
		Iid = ifId;
	}
	public int getContact() {
		return Contact;
	}
	public void setContact(int contact) {
		Contact = contact;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
}

package comBikkadIt.SterioTypeAnnotation.model;

public class student {
	private String fname;
	private String lname;
	private String address;
	private String addharNo;
	
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddharNo() {
		return addharNo;
	}
	public void setAddharNo(String addharNo) {
		this.addharNo = addharNo;
	}
	@Override
	public String toString() {
		return "student [fname=" + fname + ", lname=" + lname + ", address=" + address + ", addharNo=" + addharNo + "]";
	}

}

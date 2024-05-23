package employee;

public class emppersonalinfo {
	
	private String ename;
	private String emailId;
	
	private int mobileno;

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public int getMobileno() {
		return mobileno;
	}

	public void setMobileno(int mobileno) {
		this.mobileno = mobileno;
	}

	@Override
	public String toString() {
		return "emppersonalinfo [ename=" + ename + ", emailId=" + emailId + ", mobileno=" + mobileno + "]";
	}
	
	
}
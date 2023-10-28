import java.time.LocalDate;

public class Vendor extends Employee {
	private int no;
	public Vendor() {
		super();
	}

	public Vendor(int pid, String pname, String email,String dept, String desg, LocalDate doj,int no) {
		super(pid,pname,email,dept,desg,doj);
		this.no = no;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	@Override
	public String toString() {
		return super.toString()+ "Vendor [no=" + no + "]";
	}
	
}

package in.morgoci.dto;

import java.io.Serializable;

public class Student implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer sid;
	private String sname;
	private Integer sage;
	private String sadress;

	public Integer getSid() {
		return sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public Integer getSage() {
		return sage;
	}

	public void setSage(Integer sage) {
		this.sage = sage;
	}

	public String getSadress() {
		return sadress;
	}

	public void setSadress(String sadress) {
		this.sadress = sadress;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", sage=" + sage + ", sadress=" + sadress + "]";
	}

	
}

package raju.nit.model;

public class Employe {

	private Integer empId;
	private String empName;
	private String sal;
	private String address;

	public Employe() {
		super();
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getSal() {
		return sal;
	}

	public void setSal(String sal) {
		this.sal = sal;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employe [empId=" + empId + ", empName=" + empName + ", sal=" + sal + ", address=" + address + "]";
	}

}

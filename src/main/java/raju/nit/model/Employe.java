package raju.nit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "emptab")
public class Employe {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private Integer empId;

	@Column(name = "name")
	private String empName;

	@Column(name = "sal")
	private String empSal;

	@Column(name = "addr")
	private String empAaddress;

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

	public String getEmpSal() {
		return empSal;
	}

	public void setEmpSal(String empSal) {
		this.empSal = empSal;
	}

	public String getEmpAaddress() {
		return empAaddress;
	}

	public void setEmpAaddress(String empAaddress) {
		this.empAaddress = empAaddress;
	}

	@Override
	public String toString() {
		return "Employe [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + ", empAaddress="
				+ empAaddress + "]";
	}

}

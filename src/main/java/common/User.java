package common;

public class User {
	private String deptid;
	private String deptname;
	private String description;
	private String countemp;
	private String empname;
	private String salary;
	private String address;
	private String experience;

	public String getDeptid() {
		return deptid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	public void setDeptid(String deptid) {
		this.deptid = deptid;
	}

	public String getDeptName() {
		return deptname;
	}

	public void setDeptName(String deptname) {
		this.deptname = deptname;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCountemp() {
		return countemp;
	}

	public void setCountemp(String countemp) {
		this.countemp = countemp;
	}

}

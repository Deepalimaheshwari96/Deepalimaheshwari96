package collection.program9;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Employee {
	

	private Integer empid;
	private String empname;
	private Integer salary;
	private String deptname;
	private String address;
	
	public Employee(Integer empid, String empname, Integer salary, String deptname, String address) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.salary = salary;
		this.deptname = deptname;
		this.address = address;
	}
	public Integer getEmpid() {
		return empid;
	}
	public void setEmpid(Integer empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", salary=" + salary + ", deptname=" + deptname
				+ ", address=" + address + "]";
	}
	
	
}

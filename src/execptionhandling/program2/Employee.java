package execptionhandling.program2;

public class Employee {
	private int emp_Id;
	private String emp_name;
	private long emp_salary;
	private String[] attendance;
	
	public Employee(int emp_Id, String emp_name, long emp_salary) {
		setEmp_Id(emp_Id);
		setEmp_name(emp_name);
		setEmp_salary(emp_salary);
	}
	
	public String[] getAttendance() {
		return attendance;
	}

	public void setAttendance(String[] attendance) {
		this.attendance = attendance;
	}

	public int getEmp_Id() {
		return emp_Id;
	}

	public void setEmp_Id(int emp_Id) {
		this.emp_Id = emp_Id;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public long getEmp_salary() {
		return emp_salary;
	}

	public void setEmp_salary(long emp_salary) {
		this.emp_salary = emp_salary;
	}
    
}


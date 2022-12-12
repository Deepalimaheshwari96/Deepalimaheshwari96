package collection.program9;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class program9 {
	
	public static void main(String[] args) {
		List<List<Employee>> employeesList = null;
		employeesList = addEmployee(new Employee(101, "a", 10000, "IT", "Indore"), employeesList);
		employeesList = addEmployee(new Employee(111, "b", 8000, "IT", "Indore"), employeesList);
		employeesList = addEmployee(new Employee(121, "c", 4000, "IT", "Indore"), employeesList);
		employeesList = addEmployee(new Employee(102, "d", 3000, "IT", "Indore"), employeesList);
		employeesList = addEmployee(new Employee(122, "e", 111111, "IT", "Indore"), employeesList);
		employeesList = addEmployee(new Employee(103, "f", 12000, "IT", "Indore"), employeesList);
		employeesList = addEmployee(new Employee(133, "g", 10000, "IT", "Indore"), employeesList);
		employeesList = addEmployee(new Employee(143, "h", 10000, "IT", "Indore"), employeesList);
		for (int i = 0; i < 10; i++) {
			System.out.println("Employees stored at index" + i + " : " + employeesList.get(i));
		}

	}

	public static List<List<Employee>> addEmployee(Employee e, List<List<Employee>> employeesList) {
		if (Objects.isNull(employeesList)) {
			employeesList = new ArrayList<>();
			for (int i = 0; i < 10; i++) {
				List<Employee> list = new ArrayList<Employee>();
				employeesList.add(i, list);
			}
		}
		Integer remainder = e.getEmpid() % 10;
		List<Employee> employees = employeesList.get(remainder);

		employees.add(e);
		employeesList.set(remainder, employees);

		return employeesList;
	}



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

package oops.program1;

public class Program1 {

	public static void main(String[] args) {

		Department[] dep = new Department[3];

		Employee[] e1 = new Employee[3];
		// create object of Employee class and Customer class
		Employee employee1 = new Employee("p1", "Deep", "Dewasnaka", "25/08/1989", 10000, "01/09/2022", "Indore",
				"9589029101", "abc@gmail.com", new Department(101, "IT"));
		e1[0] = employee1;
		Employee employee2 = new Employee("p2", "surbhi", "Dewasnaka", "15/07/1999", 10000, "01/09/2022", "Indore",
				"952345678", "xxx@gmail.com", new Department(102, "HR"));
		e1[1] = employee2;
		Employee employee3 = new Employee("p3", "deepali", "Vijaynagar", "05/01/1999", 10000, "01/09/2022", "Indore",
				"898242454", "123@gmail.com", new Department(103, "SALES"));
		e1[2] = employee3;

		Customer customer = new Customer("c1", "pooja", "MR10", "25/08/1989", "01/09/2022", "MR10", "9589029101",
				"abc@gmail.com");
		customer = new Customer("c2", "aarti", "MR11", "25/09/1989", "02/09/2022", "MR10", "9589029101",
				"abc@gmail.com");
		customer = new Customer("c3", "anjali", "MR9", "25/010/1989", "03/09/2022", "MR10", "9589029101",
				"abc@gmail.com");

		for (int i = 0; i < dep.length; i++) {
			System.out.println(e1[i].toString());
		}

	}
}

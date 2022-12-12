package execptionhandling.program2;

import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class PresentDays {
	public static void main(String[] args) {

		LocalDate currentDate = LocalDate.now();
		Month currentMonth = currentDate.getMonth();
		int numberOfDaysInMonth = currentMonth.maxLength();

		Employee e1 = new Employee(101, "Ankit", 30000);
		Employee e2 = new Employee(102, "Shikha", 25000);
		Employee e3 = new Employee(103, "Surbhi", 20000);
		Employee e;

		String[] attendance = new String[30];
		String[] presence;
		int id;
		int pCount = 0;
		int nCount = 0;
		int aCount = 0;
		int lCount = 0;
		float daySalary;
		float finalSalary = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your employee id");
		id = sc.nextInt();
		System.out.println("Enter your attendance for " + currentMonth);
		System.out.println(
				"P for present, L for leave it will be paid leave, A for absent, N for no information about this day");
		for (int i = 1; i <= numberOfDaysInMonth; i++) {
			System.out.println("Day " + i);
			attendance[i - 1] = sc.next();
		}

		if (e1.getEmp_Id() == id) {
			e1.setAttendance(attendance);
			e = e1;
		} else {
			if (e2.getEmp_Id() == id) {
				e2.setAttendance(attendance);
				e = e2;
			} else {
				e3.setAttendance(attendance);
				e = e3;
			}
		}

		presence = e.getAttendance();

		for (int i = 1; i < numberOfDaysInMonth; i++) {
			if (presence[i].contains("P")) {
				pCount++;
			}
			if (presence[i].contains("L")) {
				lCount++;
			}
			if (presence[i].contains("A")) {
				aCount++;
			}
			if (presence[i].contains("N")) {

				if(i >= 4){
					if (presence[i - 3].equals(presence[i])) {
						if (presence[i - 2].equals(presence[i])) {
							if (presence[i - 1].equals(presence[i])) {
								nCount = nCount+1;
							}
						}
					}
				}
			}
		}

		if (lCount > 2) {
			try {
				throw new LeaveExceedLimitException(
						"There are only two paid leaves are allowed. Request you to re-enter your attendance and put absent accordingly.");
			} catch (LeaveExceedLimitException e4) {
				System.out.println(e4);
			}
		}else {
			if (nCount > 0) {
				try {
					throw new LeaveExceedLimitException(
							"There are only two paid leaves are allowed. Request you to re-enter your attendance and put absent accordingly.");
				} catch (LeaveExceedLimitException e4) {
					System.out.println(e4);
				}
			}else {
			  
				daySalary = (e.getEmp_salary())/31;
				finalSalary = e.getEmp_salary() - (daySalary*aCount);
			}
		}
		
      System.out.println("Employee id: "+e.getEmp_Id()+", Employee name: "+e.getEmp_name()+", Employee Salary: "+e.getEmp_salary()+", Employee this month salary: "+finalSalary);

	}


}

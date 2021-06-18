package lab5;

import com.cg.eis.exception.EmployeeException;

public class Lab5Ex3 {
//Create an Exception class named as “EmployeeException”(User defined Exception) 
//in a package named as “com.cg.eis.exception” and 
//throw an exception if salary of an employee is 
//below than 3000. Use Exception Handling mechanism to handle exception properly.

	void checkSalary(int salary) throws EmployeeException {
		if (salary < 3000) {
			throw new EmployeeException("salary of employee is less than 3000");
		} else
			System.out.println("Salary is more than 3000");
	}

	public static void main(String[] args) {
		
		Lab5Ex3 obj = new Lab5Ex3();
		try {
			obj.checkSalary(500);
			
		} catch (EmployeeException e) {
//			System.out.println(e);
			e.printStackTrace();
		}
	}

}

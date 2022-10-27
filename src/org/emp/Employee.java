package org.emp;

public class Employee {
	
	public void empID() {

		System.out.println("Employee ID = 840204");
	}
	
	public void empName() {

		System.out.println("Employee Name = Vikash");
	}
	
	public void empDob() {
		
		System.out.println("Employee DOB = 08/03/1999");

	}
	public void empPhone() {

		System.out.println("Employee PhoneNumber = 7904419510");
	}

	public void empEmail() {

		System.out.println("Employee Email = vikashashok37@gmail.com");
	}
	
	public void empAddress() {

		System.out.println("Employee Address = 2/542-1, Palaniyappalayout, ThadagamRoad, Coimbatore");
	}
	
	public static void main(String[] args) {
		
		Employee details = new Employee();
		details.empID();
		details.empName();
		details.empDob();
		details.empPhone();
		details.empEmail();
		details.empAddress();
	}
}

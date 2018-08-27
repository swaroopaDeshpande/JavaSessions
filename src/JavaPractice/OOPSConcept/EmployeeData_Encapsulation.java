package JavaPractice.OOPSConcept;

public class EmployeeData_Encapsulation {

	// private data vars
	private int SSN_no;
	private String empName;
	private int employeeAge;

	// getter and setter

	public int getSSN_no() {
		return SSN_no;
	}

	public void setSSN_no(int sSN_no) {
		SSN_no = sSN_no;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}	

	public int getEmployeeAge() {
		return employeeAge;
	}

	public void setEmployeeAge(int employeeAge) {
		this.employeeAge = employeeAge;
	}

	public static void main(String[] args) {

		EmployeeData_Encapsulation emp = new EmployeeData_Encapsulation();
		emp.setEmpName("Tom");
		emp.setEmployeeAge(30);
		emp.setSSN_no(58);
		
		System.out.println(emp.getEmpName());
		System.out.println(emp.getEmployeeAge());
		System.out.println(emp.getSSN_no());
		
		

	}

}

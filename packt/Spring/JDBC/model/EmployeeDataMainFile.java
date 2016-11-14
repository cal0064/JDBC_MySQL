package org.packt.Spring.JDBC.model;

public class EmployeeDataMainFile {

	public static void main(String[] args) {

		EmployeeDao employeeDao = new EmployeeDaoImpl();
		//employeeDao.insertEmployee(new Employee(150964, "Saurav Chatterjee"));

		Employee employee = employeeDao.getEmployeeById(150964);
		if (employee == null) {
			System.out.println("problem");
		} else {
			System.out.println(employee.getName());
		}
	}
}

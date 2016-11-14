package org.packt.Spring.JDBC.model;

public interface EmployeeDao {

	// get employee data based on employee id
	Employee getEmployeeById(int id);

	// insert values to employee table
	void insertEmployee(Employee employee);
}

package org.packt.Spring.JDBC.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.Statement;

public class EmployeeDaoImpl implements EmployeeDao {
	static final String JDBC_DRIVE = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://127.0.0.1:3306/world?user=cal0064&password=p@$$w0rd";

	private void registerDriver() {
		try {
			Class.forName(JDBC_DRIVE).newInstance();
		} catch (InstantiationException e) {
		} catch (IllegalAccessException e) {
		} catch (ClassNotFoundException e) {
		}
	}

	@Override
	public Employee getEmployeeById(int id) {
		Connection conn = null;
		Employee employee = null;
		try {
			registerDriver();
			conn = DriverManager.getConnection(DB_URL);
			PreparedStatement ps = conn.prepareStatement("select * from Employee where id = ?");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				// System.out.println("Write Something"+rs.getString("name"));
				employee = new Employee(id, rs.getString(2));
			}

			rs.close();
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		return employee;

	}

	@Override
	public void insertEmployee(Employee employee) {
		Connection conn = null;

		registerDriver();
		try {
			conn = DriverManager.getConnection(DB_URL);
			Statement statement = (Statement) conn.createStatement();
			String statementString = "insert into Employee values (" + employee.getId() + ",'" + employee.getName()
					+ "')";
			System.out.println(statementString);
			statement.executeUpdate(statementString);
			statement.execute("commit;");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
		}
	}

}

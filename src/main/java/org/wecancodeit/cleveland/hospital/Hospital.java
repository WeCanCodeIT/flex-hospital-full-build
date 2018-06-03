package org.wecancodeit.cleveland.hospital;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Hospital {

	Map<String, Employee> employees = new HashMap<>();

	public void hire(Employee anyEmployee) {
		employees.put(anyEmployee.getNumber(), anyEmployee);
	}

	public Employee findEmployee(String number) {
		return employees.get(number);
	}

	public Collection<Employee> getAllEmployees() {
		return employees.values();
	}

	public void fire(Employee anyEmployee) {
		employees.remove(anyEmployee.getNumber());
	}

	public void showEmployees() {
		for (Employee employee : employees.values()) {
			System.out.println("Emp Number: " + employee.getNumber() + " Name: " + employee.getName() + " Salary: "
					+ employee.calculatePay());
		}

	}

	public void showAllMedicalPersonnel() {
		for (Employee employee : employees.values()) {
			if (employee instanceof MedicalDuties) {
				System.out.println("Emp Number: " + employee.getNumber() + " Name: " + employee.getName());
			}
		}

	}
}

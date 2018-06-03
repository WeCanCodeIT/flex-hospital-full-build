package org.wecancodeit.cleveland.hospital;

public abstract class Employee {

	protected String empNumber;
	protected String name;

	public Employee() {

	}

	public String getNumber() {
		return empNumber;
	}

	public String getName() {
		return name;
	}

	// write a contract that all employees must get paid (something...)
	public abstract int calculatePay();

}
package org.wecancodeit.cleveland.hospital;

public class Surgeon extends Doctor {

	private boolean isOperating;

	public Surgeon(String empNumber, String name, String speciality, boolean isOperating) {
		super(empNumber, name, speciality);
		this.isOperating = isOperating;
	}

	public boolean isOperating() {

		return isOperating;
	}
	
	@Override
	public int calculatePay() {
		return 120_000;
	}

	
}

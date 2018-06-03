package org.wecancodeit.cleveland.hospital;

public class Doctor extends Employee implements MedicalDuties {

	private String speciality;

	public String getSpeciality() {
		return speciality;
	}

	public Doctor(String empNumber, String name, String speciality) {
		this.empNumber = empNumber;
		this.name = name;
		this.speciality = speciality;
	}

	@Override
	public void careForPatient(Patient anyPatient) {
		anyPatient.receiveHealth(10);

	}

	@Override
	public void drawBlood(Patient anyPatient) {
		anyPatient.giveBlood(5);

	}

	@Override
	public int calculatePay() {
		return 90_000;
	}

}

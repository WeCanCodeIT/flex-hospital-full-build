package org.wecancodeit.cleveland.hospital;

public class Nurse extends Employee implements MedicalDuties {

	private int numPatients;

	public int getNumPatients() {
		return numPatients;
	}

	public Nurse(String empNumber, String name, int numPatients) {
		this.empNumber = empNumber;
		this.name = name;
		this.numPatients = numPatients;
	}

	@Override
	public void careForPatient(Patient anyPatient) {
		anyPatient.receiveHealth(5);

	}

	@Override
	public void drawBlood(Patient anyPatient) {
		anyPatient.giveBlood(5);

	}

	public int calculatePay() {
		return 50000;
	}

}

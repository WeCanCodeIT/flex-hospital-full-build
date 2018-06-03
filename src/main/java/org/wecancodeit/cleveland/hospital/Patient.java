package org.wecancodeit.cleveland.hospital;

public class Patient {

	private int healthLevel;
	private int bloodLevel;

	public int getHealth() {

		return healthLevel;
	}

	public int getBloodLevel() {
		return bloodLevel;
	}

	// default constructor
	public Patient() {
		healthLevel = 10;
		bloodLevel = 10;
	}

	// overloaded constructor
	public Patient(int healthLevel, int bloodLevel) {
		this.healthLevel = healthLevel;
		this.bloodLevel = bloodLevel;
	}

	public void receiveHealth(int amount) {
		healthLevel += amount;

	}

	public void giveBlood(int amount) {
		bloodLevel -= amount;
	}

}

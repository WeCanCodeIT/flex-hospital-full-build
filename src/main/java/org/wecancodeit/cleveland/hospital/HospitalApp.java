package org.wecancodeit.cleveland.hospital;

import java.util.Scanner;

public class HospitalApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Hospital myHospital = new Hospital();

		Doctor phil = new Doctor("1", "Phil", "Brain");
		Nurse jackie = new Nurse("2", "Jackie", 5);
		Janitor rosie = new Janitor("3", "Rosie", true);
		Surgeon harry = new Surgeon("4", "Harry", "Plastic", false);

		myHospital.hire(phil);
		myHospital.hire(jackie);
		myHospital.hire(rosie);
		myHospital.hire(harry);

		System.out.println("Welcome to TOWER City Hospital!");
		System.out.println("Here are our current employees:");
		myHospital.showEmployees();

		String choice = "";
		do {
			System.out.println("Press 1 to Hire an Employee");
			System.out.println("Press 2 to Fire an Employee");
			System.out.println("Press 3 to see all Medical Personnel");
			System.out.println("Type exit to leave the software");
			choice = input.nextLine();

			if (choice.equals("1")) {
				System.out.println("What position are you hiring for?");
				System.out.println("[Doctor], [Nurse], [Janitor], [Surgeon]");
				String position = input.nextLine();
				if (position.equals("Doctor")) {
					System.out.println("Enter the employee number:");
					String empNumber = input.nextLine();
					System.out.println("Enter the name of the Doctor: ");
					String name = input.nextLine();
					System.out.println("Enter the speciality area: ");
					String speciality = input.nextLine();
					myHospital.hire(new Doctor(empNumber, name, speciality));
				} else if (position.equals("Nurse")) {
					System.out.println("Enter the employee number:");
					String empNumber = input.nextLine();
					System.out.println("Enter the name of the Nurse: ");
					String name = input.nextLine();
					System.out.println("Enter the number of patients: ");
					int numPatients = input.nextInt();
					myHospital.hire(new Nurse(empNumber, name, numPatients));
				} else if (position.equals("Janitor")) {
					System.out.println("Enter the employee number:");
					String empNumber = input.nextLine();
					System.out.println("Enter the name of the Janitor: ");
					String name = input.nextLine();
					System.out.println("The janitor is sweeping (true or false?): ");
					boolean isSweeping = input.nextBoolean();
					myHospital.hire(new Janitor(empNumber, name, isSweeping));
				} else if (position.equals("Surgeon")) {
					System.out.println("Enter the employee number:");
					String empNumber = input.nextLine();
					System.out.println("Enter the name of the Surgeon: ");
					String name = input.nextLine();
					System.out.println("Enter the speciality area: ");
					String speciality = input.nextLine();
					System.out.println("The surgeon is operating (true or false?): ");
					boolean isOperating = input.nextBoolean();
					myHospital.hire(new Surgeon(empNumber, name, speciality, isOperating));
				}

			} else if (choice.equals("2")) {
				System.out.println("Here are our employees");
				myHospital.showEmployees();
				System.out.println("Enter the employee number of who you want to fire");
				String empNumber = input.nextLine();
				myHospital.fire(myHospital.findEmployee(empNumber));

			} else if (choice.equals("3")) {
				System.out.println("Here are all of our Medical Personnel");
				myHospital.showAllMedicalPersonnel();
			}

			System.out.println("Our current employees are:");
			myHospital.showEmployees();
		} while (!choice.equals("exit"));

		input.close();
	}

}

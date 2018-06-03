package org.wecancodeit.cleveland.hospital;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class DoctorTest {

	Doctor anyDoctor = new Doctor("1", "phil", "brain");
	Patient anyPatient = new Patient();
	Patient verySickPatient = new Patient(1, 1);

	@Test
	public void shoudRenderProperDoctorProperties() {
		String number = anyDoctor.getNumber();
		String name = anyDoctor.getName();
		String speciality = anyDoctor.getSpeciality();
		assertEquals("1", number);
		assertThat(name, is("phil"));
		assertEquals("brain", speciality);
	}

	@Test
	public void shouldIncreasePatientHealthFrom10To20() {
		anyDoctor.careForPatient(anyPatient);
		int checkHealth = anyPatient.getHealth();
		assertEquals(20, checkHealth);
	}

	@Test
	public void shouldLowerBloodLevelsFrom10To5() {
        anyDoctor.drawBlood(anyPatient);
        int checkBlood = anyPatient.getBloodLevel();
        assertEquals(5, checkBlood);
	}
	
	@Test
	public void shouldHaveASalaryOf90000() {
		int salary = anyDoctor.calculatePay();
		assertEquals(90000, salary);
	}

}

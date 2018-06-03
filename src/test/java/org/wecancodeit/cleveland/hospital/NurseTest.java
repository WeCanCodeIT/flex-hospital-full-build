package org.wecancodeit.cleveland.hospital;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class NurseTest {

	Nurse anyNurse = new Nurse("2", "jackie", 5);
	Patient anyPatient = new Patient();

	@Test
	public void shoudRenderProperNurseProperties() {
		String number = anyNurse.getNumber();
		String name = anyNurse.getName();
		int patients = anyNurse.getNumPatients();
		assertEquals("2", number);
		assertThat(name, is("jackie"));
		assertEquals(patients, 5);
	}

	@Test
	public void shouldIncreasePatientHealthFrom10To15() {
		anyNurse.careForPatient(anyPatient);
		int checkHealth = anyPatient.getHealth();
		assertEquals(15, checkHealth);
	}

	@Test
	public void shouldLowerBloodLevelsFrom10To5() {
		anyNurse.drawBlood(anyPatient);
		int checkBlood = anyPatient.getBloodLevel();
		assertEquals(5, checkBlood);
	}

	@Test
	public void shouldHaveASalaryOf50000() {
		int salary = anyNurse.calculatePay();
		assertEquals(50000, salary);
	}

}

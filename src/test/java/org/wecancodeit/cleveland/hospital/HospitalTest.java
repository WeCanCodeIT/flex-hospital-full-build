package org.wecancodeit.cleveland.hospital;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.Assert.assertThat;

import java.util.Collection;

import org.junit.Before;
import org.junit.Test;

public class HospitalTest {

	Hospital myHospital;
	Patient alan;
	Doctor phil;
	Janitor rosie;

	@Before
	public void setUp() {
		myHospital = new Hospital();
		alan = new Patient();
		phil = new Doctor("1", "phil", "brain");
		rosie = new Janitor("2", "rosie", true);
	}

	@Test
	public void hospitalShouldBeABleToHireAnEmployee() {
		myHospital.hire(rosie);
		Employee foundJanitor = myHospital.findEmployee(rosie.getNumber());
		assertThat(foundJanitor, is(rosie));
	}

	@Test
	public void hospitalShouldBeAbleToHireTwoEmployees() {
		myHospital.hire(rosie);
		myHospital.hire(phil);
		Employee foundJanitor = myHospital.findEmployee(rosie.getNumber());
		Employee foundDoctor = myHospital.findEmployee(phil.getNumber());
		assertThat(foundJanitor, is(rosie));
		assertThat(foundDoctor, is(phil));
	}
	
	@Test
	public void hospitalShouldHireACollectionOfEmployees() {
		myHospital.hire(rosie);
		myHospital.hire(phil);
		Collection<Employee> hiredEmployees = myHospital.getAllEmployees();
		assertThat(hiredEmployees, containsInAnyOrder(rosie, phil));
		//OR
		assertThat(hiredEmployees.size(), is(2));
	}
	
	@Test
	public void hospitalShouldBeAbleToFireAnEmployee() {
		myHospital.hire(rosie);
		myHospital.hire(phil);
		myHospital.fire(phil);
		Collection<Employee> hiredEmployees = myHospital.getAllEmployees();
		assertThat(hiredEmployees, containsInAnyOrder(rosie));
		//OR
		assertThat(hiredEmployees.size(), is(1));
	}

}

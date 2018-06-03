package org.wecancodeit.cleveland.hospital;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class JanitorTest {

	Janitor anyJanitor = new Janitor("3", "rosie", true);

	@Test
	public void shoudRenderProperJanitorProperties() {
		String number = anyJanitor.getNumber();
		String name = anyJanitor.getName();
		boolean isSweeping = anyJanitor.isSweeping();
		assertEquals("3", number);
		assertThat(name, is("rosie"));
		assertTrue(isSweeping);
	}

	@Test
	public void shouldHaveASalaryOf40k() {
		int salary = anyJanitor.calculatePay();
		assertEquals(40000, salary);
	}

}

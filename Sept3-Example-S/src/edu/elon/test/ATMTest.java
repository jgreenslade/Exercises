package edu.elon.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ATMTest {
	
	ATM atm;
	
	@Before
	public void setUp() throws Exception {
		atm = new ATM(50);
	}

	@After
	public void tearDown() throws Exception {
		atm = new ATM(50);
	}

	@Test
	public void testDeposit() {
		atm.deposit(20);
		assertEquals(atm.getBalance(), 70.0, 
				0.1);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testDeposit2() {
		atm.deposit(-10);
	}

	@Test
	public void testGetBalance() {
		System.out.println(atm.getBalance());
		assertEquals(50.0, atm.getBalance(), 0.1);
	}

	@Test
	public void testToString() {
		assertEquals("Amount balance is $50.00", atm.toString());
	}

	@Test
	public void testWithdraw() {
		atm.withdraw(10); // Fix error in code
		assertEquals(atm.getBalance(), 40, 0.1);
		//System.out.println(atm.getBalance());
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testWithdraw2() {
		atm.withdraw(80); // Fix error in code
	}

}

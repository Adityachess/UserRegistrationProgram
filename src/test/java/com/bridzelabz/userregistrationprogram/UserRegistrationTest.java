package com.bridzelabz.userregistrationprogram;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class UserRegistrationTest {
	@Test
	public void firstNameReturnTrueWhenValid() {
		UserRegistration object = new UserRegistration();
		boolean result = object.validateFirstName("Firstnameexample");
		assertEquals(true, result);
	}

	@Test
	public void firstNameReturnFalseWhenInvalid() {
		UserRegistration object = new UserRegistration();
		boolean result = object.validateFirstName("firstnameexample");
		assertEquals(true, result);
	}

	@Test
	public void LastNameReturnTrueWhenValid() {
		UserRegistration object = new UserRegistration();
		boolean result = object.validateLastName("Lastnameexample");
		assertEquals(true, result);
	}

	@Test
	public void LastNameReturnFalseWhenInvalid() {
		UserRegistration object = new UserRegistration();
		boolean result = object.validateLastName("lastnameexample");
		assertEquals(true, result);
	}

	@Test
	public void EmailReturnTrueWhenValid() {
		UserRegistration object = new UserRegistration();
		boolean result = object.validateEmail("example.correct@mail.com");
		assertEquals(true, result);
	}

	@Test
	public void EmailReturnFalseWhenInvalid() {
		UserRegistration object = new UserRegistration();
		boolean result = object.validateEmail("example.wrong.mail.com");
		assertEquals(true, result);
	}

	@Test
	public void PhoneReturnTrueWhenValid() {
		UserRegistration object = new UserRegistration();
		boolean result = object.validatePhone("911234567890");
		assertEquals(true, result);
	}

	@Test
	public void PhoneReturnFalseWhenInvalid() {
		UserRegistration object = new UserRegistration();
		boolean result = object.validatePhone("123456789X");
		assertEquals(true, result);
	}

	@Test
	public void PasswordReturnTrueWhenValid() {
		UserRegistration object = new UserRegistration();
		boolean result = object.validatePassword("ExampleCorrectPassword123#");
		assertEquals(true, result);
	}

	@Test
	public void PasswordReturnFalseWhenInvalid() {
		UserRegistration object = new UserRegistration();
		boolean result = object.validatePassword("examplewrongpassword");
		assertEquals(true, result);
	}
}

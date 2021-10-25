package com.bridzelabz.userregistrationprogram;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class UserRegTest {
	@Test
	public void firstNameReturnTrueWhenValid() {
		UserRegistration object = new UserRegistration();
		try {
			boolean result = object.validateFirstName("Firstnameexample");
			assertEquals(true, result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void firstNameReturnFalseWhenInvalid() {
		UserRegistration object = new UserRegistration();
		try {
			boolean result = object.validateFirstName("firstnameexample");
			assertEquals(true, result);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void LastNameReturnTrueWhenValid() {
		UserRegistration object = new UserRegistration();
		try {
			boolean result = object.validateLastName("Lastnameexample");
			assertEquals(true, result);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void LastNameReturnFalseWhenInvalid() {
		UserRegistration object = new UserRegistration();
		try {
			boolean result = object.validateLastName("lastnameexample");
			assertEquals(true, result);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void EmailReturnTrueWhenValid() {
		UserRegistration object = new UserRegistration();
		try {
			boolean result = object.validateEmail("example.correct@mail.com");
			assertEquals(true, result);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void EmailReturnFalseWhenInvalid() {
		UserRegistration object = new UserRegistration();
		try {
			boolean result = object.validateEmail("example.wrong.mail.com");
			assertEquals(true, result);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void PhoneReturnTrueWhenValid() {
		UserRegistration object = new UserRegistration();
		try {
			boolean result = object.validatePhone("911234567890");
			assertEquals(true, result);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void PhoneReturnFalseWhenInvalid() {
		UserRegistration object = new UserRegistration();
		try {
			boolean result = object.validatePhone("123456789X");
			assertEquals(true, result);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void PasswordReturnTrueWhenValid() {
		UserRegistration object = new UserRegistration();
		try {
			boolean result = object.validatePassword("ExampleCorrectPassword123#");
			assertEquals(true, result);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void PasswordReturnFalseWhenInvalid() {
		UserRegistration object = new UserRegistration();
		try {
			boolean result = object.validatePassword("examplewrongpassword");
			assertEquals(true, result);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
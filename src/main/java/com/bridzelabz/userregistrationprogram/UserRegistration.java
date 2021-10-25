package com.bridzelabz.userregistrationprogram;

import java.util.Scanner;
import java.util.function.Predicate;
import java.util.regex.Pattern;

public class UserRegistration {
	public static final Scanner sc = new Scanner(System.in);
	public final String firstNamePattern = "^[A-Z]{1}[a-z]{2,}$";
	public final String lastNamePattern = "^[A-Z]{1}[a-z]{2,}$";
	public final String emailPattern = "[a-z0-9_]*[.a-z0-9_]*?@[a-z]*.[a-z]*[.a-z]?$";
	public final String phonePattern = "^[0-9]{2}[0-9]{10}$";
	public final String passwordPattern = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&-+=()]).{8,}$";


	/**
	 * This method checks if the entered first name is valid
	 */
	public boolean validateFirstName(String fname) throws UserRegistrationException {
			Predicate<String> validateFirstName1 = n -> n.matches(firstNamePattern);
		boolean result = validateFirstName1.test(fname);

		if (result == true) {
			return true;
		} else {
			throw new UserRegistrationException("Enter Valid First Name");
		}

	}

	/**
	 *  This method checks if the entered lawst name is valid
	 */
	public boolean validateLastName(String lname) throws UserRegistrationException {
		
		Predicate<String> validateLast = n -> n.matches(firstNamePattern);
		boolean result = validateLast.test(lname);
		if (result == true) {
			return true;
		} else {
			throw new UserRegistrationException("Enter Valid First Name");
		}
	}

	/**
	 *  This method checks if the entered email is valid
	 */
	public boolean validateEmail(String email) throws UserRegistrationException {
		
		Predicate<String> validateEmail = n -> n.matches(EMAIL_PATTERN);
		boolean result = validateEmail.test(email);
		if (result == true) {
			return true;
		} else {
			throw new UserRegistrationException("Enter Valid First Name");
		}
	}

	/**
	 *  This method checks if the entered phone number is valid
	 */
	public boolean validatePhone(String phone) throws UserRegistrationException {
		
		Predicate<String> validatePhone = n -> n.matches(PHONE_PATTERN);
		boolean result = validatePhone.test(phone);
		if (result == true) {
			return true;
		} else {
			throw new UserRegistrationException("Enter Valid First Name");
		}
	}

	/**
	 *  This method checks if the entered password is valid
	 */
	public boolean validatePassword(String password) throws UserRegistrationException {
		
		Predicate<String> validateFirstName1 = n -> n.matches(PASSWORD_PATTERN);
		boolean result = validateFirstName1.test(password);
		if (result == true) {
			return true;
		} else {
			throw new UserRegistrationException("Enter Valid First Name");
		}
	}

	public static void main(String[] args) {

		System.out.println("Enter First Name: ");
		String fname = sc.next();
		UserRegistration obj = new UserRegistration();
		if (obj.validateFirstName(fname)) {
			System.out.println("First Name Valid");
		} else {
			System.out.println("First Name Invalid");
		}

		System.out.println("\nEnter Last Name: ");
		String lname = sc.next();
		if (obj.validateFirstName(lname)) {
			System.out.println("Last Name Valid");
		} else {
			System.out.println("Last Name Invalid");
		}

		System.out.println("\nEnter Email: ");
		sc.nextLine();
		String email = sc.next();
		if (obj.validateEmail(email)) {
			System.out.println("Email Valid");
		} else {
			System.out.println("Email Invalid");
		}

		System.out.println("\nEnter Phone No with Country Code: ");
		String phone = sc.next();
		if (obj.validatePhone(phone)) {
			System.out.println("Phone No. Valid");
		} else {
			System.out.println("Phone No. Invalid");
		}
		System.out.println(
				"\nEnter Password (Min 8 characters with Atleast 1 Uppercase, 1 Numeric Digit, 1 Special Character): ");
		String password = sc.next();
		if (obj.validatePassword(password)) {
			System.out.println("Password Valid");
		} else {
			System.out.println("Password Invalid");
		}

		System.out.println("\nSamples Emails to Test");
		obj.emailTest("abc@yahoo.com");
		obj.emailTest("abc-100@yahoo.com");
		obj.emailTest("abc.100@yahoo.com");
		obj.emailTest("abc111@abc.com");
		obj.emailTest("abc-100@abc.net");
		obj.emailTest("abc.100@abc.com.au");
		obj.emailTest("abc@1.com");
		obj.emailTest("abc@gmail.com.com");
		obj.emailTest("abc+100@gmail.com");
	}
}
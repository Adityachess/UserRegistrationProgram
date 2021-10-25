package com.bridzelabz.userregistrationprogram;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
	public static final Scanner sc = new Scanner(System.in);
	public final String firstNamePattern = "^[A-Z]{1}[a-z]{2,}$";
	public final String lastNamePattern = "^[A-Z]{1}[a-z]{2,}$";
	public final String emailPattern = "[a-z0-9_]*[.a-z0-9_]*?@[a-z]*.[a-z]*[.a-z]?$";
	public final String phonePattern = "^[0-9]{2}[0-9]{10}$";

	/**
	 * This method checks if the entered first name is valid
	 * 
	 * @return
	 */
	public boolean validateFirstName(String fname) {
		Pattern pattern = Pattern.compile(firstNamePattern);
		return pattern.matcher(fname).matches();
	}

	public boolean validateLastName(String lname) {
		Pattern pattern = Pattern.compile(lastNamePattern);
		return pattern.matcher(lname).matches();
	}

	/**
	 * This method checks if the entered email is valid
	 */
	public boolean validateEmail(String email) {
		Pattern pattern = Pattern.compile(emailPattern);
		return pattern.matcher(email).matches();
	}

	/**
	 * This method checks if the entered phone number is valid
	 */
	public boolean validatePhone(String phone) {
		Pattern pattern = Pattern.compile(phonePattern);
		return pattern.matcher(phone).matches();
	}

	/**
	 * This is the main function
	 * 
	 * @param args
	 */
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
	}
}
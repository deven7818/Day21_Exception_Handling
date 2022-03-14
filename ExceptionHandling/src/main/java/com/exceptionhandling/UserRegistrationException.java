package com.exceptionhandling;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistrationException {
	

	/*
	 * Scanner class object to get value from user
	 */
	Scanner sc = new Scanner(System.in);
	
	
	/**
	 * Method to Enter FirstName
	 * First Name should start with capital and has minimum 3 characters
	 * if entered firstName matches the pattern then it gives true value
	 * else it gives false Invalid first name
	 */
	public void firstName() {
		System.out.println("Enter First Name : ");
		String FirstName = sc.next();
		boolean result = Pattern.matches("[A-Z][a-z]{2,}", FirstName);
		if(result) 
			System.out.println("Valid firstName");
		else
			System.out.println("Invalid... Please Enter Valid first name");
	}
	
	/**
	 * Method to Enter LastName
	 * Last Name should start with capital and has minimum 3 characters
	 * if entered lastName matches the pattern then it gives true value
	 * else it gives false Invalid last name
	 */
	public void lastName() {
		System.out.println("Enter Last Name : ");
		String LastName = sc.next();
		boolean result = Pattern.matches("[A-Z][a-z]{2,}", LastName);
		if(result) 
			System.out.println("Valid LastName");
		else
			System.out.println("Invalid... Please Enter Valid last name");
	}
}
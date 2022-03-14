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
	 * Method to Enter lastName
	 * First Name should start with capital and has minimum 3 characters
	 * if entered lastName matches the pattern then it gives true value
	 * else it gives false Invalid first name
	 */
	public void lastName() {
		System.out.println("Enter last Name : ");
		String LastName = sc.next();
		boolean result = Pattern.matches("[A-Z][a-z]{2,}", LastName);
		if(result) 
			System.out.println("Valid lastName");
		else
			System.out.println("Invalid... Please Enter Valid last name");
	}
	/**
	 * Method to Enter Email
	 * e.g. abc.xyz@bl.co.in Email address has 3 parts mandatory and 2 parts optional
	 * if entered email matches the pattern then it gives true value
	 * else it gives false Invalid email address
	 */
	public void email() {
		System.out.println("Enter the Email : ");
		String Email = sc.next();
		boolean result = Pattern.matches("^[a-z0-9]+([_+-.][0-9a-z]+)*@[a-z]+.[a-z]{2,3}$", Email);
		//boolean result = Pattern.matches("^[a-zA-Z0-9_.]*[-]*[+]*[a-zA-Z0-9]*@[a-zA-Z0-9]+([.][a-zA-Z]+)$", Email);
		if(result)
			System.out.println("Valid Email");
		else
			System.out.println("Invalid... Please Enter Valid Email Adderss");
	}
	

}
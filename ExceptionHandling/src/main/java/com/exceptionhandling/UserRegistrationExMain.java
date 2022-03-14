package com.exceptionhandling;


/**
 * PRODEDURE
 * User Registration 
 * User Registration System needs to ensure all validations are in place during the User Entry
 * 1. User needs to enter a valid First Name
 * 
 *
 */
public class UserRegistrationExMain {
    public static void main( String[] args )
    {
    	/*
    	 * Creating object of userDetails class
    	 */
    	UserRegistrationException user = new UserRegistrationException();
    	
    	/**
    	 * calling firstName method to ensure valid first name
    	 */
    	user.firstName();
    	
    	/**
    	 * calling lastName method to ensure valid last name
    	 */
    	user.lastName();
    }
}
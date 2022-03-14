package com.exceptionhandling;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * PROCEDURE 1. Test case for firstName 2. Test case for lastName 3. Test case
 * for emailName 4. Test case for mobileNumber 5. Test case for password 6.
 * Parameterized Test case for multiple entry for Email validation
 */

public class UserValidationTest {

	/**
	 * Test case for firstName validation throws CustomException checks firstName
	 * for condition if matches it satisfied else it throws exception and print
	 * message from Throwable class
	 */

	@Test
	public void firstNameValidator() throws CustomException {
		try {
			String firstName = "Deven";
			assertEquals(true, UserRegistration.firstName(firstName));
		} catch (CustomException ex) {
			System.out.println(ex.getMessage());
		}
	}

	/**
	 * Test case for lastName validation throws CustomException checks firstName for
	 * condition if matches it satisfied else it throws exception and print message
	 * from Throwable class
	 */

	@Test
	public void lastNameValidator() throws CustomException {
		try {
			String lastName = "Mali";
			assertEquals(true, UserRegistration.lastName(lastName));
		} catch (CustomException ex) {
			System.out.println(ex.getMessage());
		}
	}

	/**
	 * Test case for email validation throws CustomException checks firstName for
	 * condition if matches it satisfied else it throws exception and print message
	 * from Throwable class
	 */

	@Test
	public void emailValidator() throws CustomException {
		try {
			String email = "deven7818@gmail.com";
			assertEquals(true, UserRegistration.email(email));
		} catch (CustomException ex) {
			System.out.println(ex.getMessage());
		}
	}

	/**
	 * Test case for password validation throws CustomException checks firstName for
	 * condition if matches it satisfied else it throws exception and print message
	 * from Throwable class
	 */

	@Test
	public void passwordValidator() throws CustomException {
		try {
			String password = "Deven@8055";
			assertEquals(true, UserRegistration.password(password));
		} catch (CustomException ex) {
			System.out.println(ex.getMessage());
		}
	}
	
	
}

package lab0;

import java.util.Date;

/**
 * In this challenge you need to address the probability that at some point the
 * arguments to method parameters may not be valid. <p> For example, String
 * arguments may be null or empty; other objects may be null; or primitive
 * numbers may be out of acceptable range. <p> You need to validate ALL method
 * parameters to make sure any and all arguments are valid. The only exception
 * is when any argument is acceptable based on requirements. Fix the code below
 * using if logic to validate method arguments and throw
 * IllegalArgumentException or a custom exception if the validation fails.
 *
 * @author Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class Employee {

    public static final int MAX_VACATION_DAYS = 28;
    private String firstName;
    private String lastName;
    private String ssn;
    private Date hireDate;
    private int daysVacation;

    public Employee() {
	firstName = "Unknown";
	lastName = "Unknown";
	ssn = "Unknown";
	hireDate = new Date();
	daysVacation = 0;
    }

    public Employee(String firstName, String lastName, String ssn, Date hireDate, int daysVacation) {
	this.firstName = firstName;
	this.lastName = lastName;
	this.ssn = ssn;
	this.hireDate = hireDate;
	this.daysVacation = daysVacation;
    }

    public int getDaysVacation() {
	return daysVacation;
    }

    public void setDaysVacation(int daysVacation) {
	this.daysVacation = daysVacation;
    }

    public String getFirstName() {
	return firstName;
    }

    /*
     * do not allow null or zero length, only allow letters, numbers,
     * hyphens and spaces (except first letter has to be a letter); 
     * allow any letter case for the text and adjust it later in the code
     */
    public void setFirstName(String firstName) {

	// check if first name isn't null or it isn't empty space character
	if ((firstName == null) || (firstName.length() == 0)) {

	    throw new IllegalArgumentException("Entry is required");
	}

	if (!Character.isLetter(firstName.charAt(0))) {

	    throw new IllegalArgumentException("Letter as first character of the name is required");
	}

	this.firstName = firstName;

    }

    public Date getHireDate() {
	return hireDate;
    }

    public void setHireDate(Date hireDate) {
	this.hireDate = hireDate;
    }

    public String getLastName() {
	return lastName;
    }

    public void setLastName(String lastName) {
	
	// check if last name isn't null or it isn't empty space character
	if ((lastName == null) || (lastName.length() == 0)) {

	    throw new IllegalArgumentException("Entry is required");
	}
	
	// check if at least first character of Last name is a letter
	if (!Character.isLetter(lastName.charAt(0))) {

	    throw new IllegalArgumentException("Letter as first character of the last name is required");
	}
	
	this.lastName = lastName;
    }

    public final String getSsn() {
	return ssn;
    }

    public void setSsn(String ssn) {
	this.ssn = ssn;
    }
}

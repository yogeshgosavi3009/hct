package com.crts.app.hct.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
	
	private String FirstName;
	 private String LastName;
	 @Id
	private long PhoneNumber; 
	private String EmailAddress; 
	private String ResidentialAddress;
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public long getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		PhoneNumber = phoneNumber;
	}
	public String getEmailAddress() {
		return EmailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		EmailAddress = emailAddress;
	}
	public String getResidentialAddress() {
		return ResidentialAddress;
	}
	public void setResidentialAddress(String residentialAddress) {
		ResidentialAddress = residentialAddress;
	}
	
	
	
	//(State, City,
	 //Country, Pincode).

}

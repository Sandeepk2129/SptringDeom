package com.luv2code.springdemo.mvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Customer {
	
	private String firstName;
	
	@NotNull(message = "is Required")
	@Size(min = 1, message="is Required")
	private String lastName;
	
	
	@NotNull(message = "is Required")
	@Min(value = 0, message="Value must be greater then Zero")
	@Max(value = 10, message="Value must be less then ten")
	private Integer freePass;
	
	@Pattern(regexp="[a-zA-Z0-9]{5}", message="Only 5 char/digit")
	private String postalCode;
	
	
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Integer getFreePass() {
		return freePass;
	}
	public void setFreePass(Integer freePass) {
		this.freePass = freePass;
	}
	
	

}

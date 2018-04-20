package com.luv2code.springdemo.mvc;

import java.util.LinkedHashMap;

public class Student {
	
	private String firstName;
	private String lastName;
	private String country;
	private String favLanguage;
	//Reading countries from property file
//	private LinkedHashMap<String, String> countryOption;
	public Student(){
//		countryOption = new LinkedHashMap<>();
//		countryOption.put("IND", "India");
//		countryOption.put("BRA", "Brazil");
//		countryOption.put("USA", "America");
//		countryOption.put("PAK", "Pakistan");
//		countryOption.put("SRI", "Srilanka");
		
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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getFavLanguage() {
		return favLanguage;
	}

	public void setFavLanguage(String favLanguage) {
		this.favLanguage = favLanguage;
	}

//	public LinkedHashMap<String, String> getCountryOption() {
//		return countryOption;
//	}
	
	
	
	
	
	
	

}

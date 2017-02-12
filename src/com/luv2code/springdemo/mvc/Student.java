package com.luv2code.springdemo.mvc;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;

public class Student {

	private String firstName;
	private String lastName;

	private String country;
	private LinkedHashMap<String, String> countryOptions;
	
	private String favoriteLanguage;
	private String[] operatingSystems;
	
	
	public Student() {
		// populate country options: used ISO country code
		countryOptions = new LinkedHashMap<>();
		
		countryOptions.put("IN", "India");
		countryOptions.put("BR", "Brazil");
		countryOptions.put("DE", "Germany");
		countryOptions.put("FR", "France");
		
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

	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}
	
	public String getCountryFullName() {
		return countryOptions.get(country);
	}

	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}

	public String[] getOperatingSystems() {
		return operatingSystems;
	}

	public void setOperatingSystems(String[] operatingSystems) {
		this.operatingSystems = operatingSystems;
	}
	
	
}

package springDemo.MVC;

import java.util.LinkedHashMap;

public class Student {
 
	private String firstName;
	private String lastName;
	private String country;
	
	private LinkedHashMap<String, String> countryOptions;
	
	public Student() {
		//popular country options:used Iso country code
		countryOptions = new LinkedHashMap<>();
		
		countryOptions.put("br", "Brazil");
		countryOptions.put("Bn", "Bangladesh");
		countryOptions.put("In", "India");
		countryOptions.put("pk", "pakisthan");
	}
	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
		
	}
	public String getCountry() {
		return country;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstNameString) {
		this.firstName = firstNameString;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}

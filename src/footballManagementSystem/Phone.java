package footballManagementSystem;

public class Phone { // attributes for phone class 
	private String countryCode;
	private String areaCode;
	private String number;
	
	public Phone(String countryCode,String areaCode,String number) { // constructor for attributes 
		this.countryCode=countryCode;
		this.areaCode=areaCode;
		this.number=number;
	}

	public String getCountryCode() {return countryCode;} // getters for our phone 

	public String getAreaCode() {return areaCode;}

	public String getNumber() {return number;}

}

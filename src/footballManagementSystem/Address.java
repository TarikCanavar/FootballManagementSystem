package footballManagementSystem;

public class Address { // attributes
	private String streetNo;
	private String doorNo;
	private String district;
	private String city;
	

	public Address(String streetNo,String doorNo,String district,String city) {

		this.streetNo=streetNo; // standart constructor
		this.doorNo=doorNo;
		this.district=district;
		this.city=city;
	}
	public Address(String streetNo,String doorNo,String district) {
		this.streetNo=streetNo;  // when input do not include city
		this.doorNo=doorNo;
		this.district=district;
		this.city="Ýstanbul";
	}
	public class Country{
		// I couldn't find a efficient way to use inner classes unfortunately.
	}
public String getStreetNo() {return streetNo;} // getters
public String getDoorNo() {return doorNo;}
public String getDistrict() {return district;}
public String getCity() {return city;}
}

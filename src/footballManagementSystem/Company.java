package footballManagementSystem;

public class Company { // attributes which include othet class type variables
	private static int Id = 1;
	private String name;
	private Address compAddress;
	private Phone compPhone;	
	private int CompanyId;
	private Team compTeam;
	
	public Company(String name,Address compAddress,Phone compPhone,Team compTeam) {
		this.name=name; // standart constructor and incrementing id for each company
		this.compAddress=compAddress;
		this.compPhone=compPhone;
		this.compTeam=compTeam;
	CompanyId=Id;
	Id++;
	}

	public Team getCompanyTeam() {return compTeam;} // getters
	public int getCompanyId() {return CompanyId;}
	public String getName() {return name;}
	public Address getCompAddress() {return compAddress;}
	public Phone getCompPhones() {return compPhone;}
}

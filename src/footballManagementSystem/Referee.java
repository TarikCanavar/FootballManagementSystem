package footballManagementSystem;

public class Referee{  // attributes for referess id is static beacuse it should increase for every referee
    private static int Id = 1;
	private String name;
	private Address refAddress;
	private Phone refPhone;
	private int salary;
	private int RefereeId;
	
	public Referee(String name,Address refAddress, Phone refPhone, int salary) { // standart constructor incrementing id when it is called
		this.name=name;
		this.refAddress=refAddress;
		this.refPhone=refPhone;
		this.salary=salary;
		RefereeId=Id;
		Id++;
	}
	public Referee(int RefereeId) { // constructor when input is only id such as match
		this.RefereeId=RefereeId;
		
		RefereeId=Id;
		Id++;
	}
	public int getId() {return RefereeId;} // getters
	public String getName() {return name;}
	public Address getRefAddress() {return refAddress;}
	public Phone getRefPhones() {return refPhone;}
	public int getSalary() {return salary;}
	
}

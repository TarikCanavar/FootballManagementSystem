package footballManagementSystem;

public class Player {               // attributes for player which include types of other classes variables
	private static int Id = 1;
	private int licenseNumber;
	private String name;
	private Date birthdate;
	private String nationality;
	private Address playerAddress;
	private Team playerTeam;
	private Phone playerPhone;
	private Date startDate;
	private Date endDate;
	private int salary;
	private String positionalRole;
	private int playerId;
	
	public Player(int licenseNumber,String name,Date birthdate,String nationality,Address playerAddress,Phone playerPhone, Team playerTeam,Date startDate,Date endDate, int salary,String positionalRole) {
		this.licenseNumber=licenseNumber; // standart constructor for player and incrementing id 
		this.name=name;
		this.birthdate=birthdate;
		this.nationality=nationality;
		this.playerTeam=playerTeam;
		this.playerAddress=playerAddress;
		this.playerPhone=playerPhone;
		this.startDate=startDate;
		this.endDate=endDate;
		this.salary=salary;
		this.positionalRole=positionalRole;
		playerId=Id;
		Id++;
	}
	public int getPlayerId() {return playerId;} // getters
	
	public int getLicenseNumber() {return licenseNumber;}

	public String getName() {return name;}

	public Date getBirthdate() {return birthdate;}

	public String getNationality() {return nationality;}
	
	public Team getTeam() {return playerTeam;}

	public Address getPlayerAddress() {return playerAddress;}

	public Phone getPlayerPhones() {return playerPhone;}

	public Date getStartDate() {return startDate;}

	public Date getEndDate() {return endDate;}

	public int getSalary() {return salary;}

	public String getPositionalRole() {return positionalRole;}

}


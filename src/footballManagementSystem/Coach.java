package footballManagementSystem;

public class Coach {        // attributes for coach which includes other class type variables
	private static int Id = 1;
	private int coachId;
	private String name;
	private Address coachAddress;
	private Phone coachPhone;
	private Date startDate;
	private Date endDate;
	private Team coachTeam;
	private int salary;
	
	
	public Coach(String name,Address coachAddress,Phone coachPhone,Team coachTeam,Date startDate,Date endDate,int salary) {
		this.name=name;            // standart constructor and incrementing id for each coach 
		this.coachAddress=coachAddress;
		this.coachPhone=coachPhone;
		this.startDate=startDate;
		this.endDate=endDate;
		this.salary=salary;
        coachId=Id;
        Id++;
          }
	public Coach(String name) { // if input is only coach name
		this.name=name;
		coachId=Id;
        Id++;
	}
	


	public int getCoachId() {return coachId;} // getters
	
	public Team getTeam() {return coachTeam;}


	public String getName() {return name;}


	public Address getCoachAddress() {return coachAddress;}


	public Phone getCoachPhones() {return coachPhone;}


	public Date getStartDate() {return startDate;}


	public Date getEndDate() {return endDate;}


	public int getSalary() {return salary;}
}

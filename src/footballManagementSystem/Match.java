package footballManagementSystem;

public class Match { // attributes which include othet class type variables like team and referee
	private Team homeTeam;
	private int homeGoals;
	private Team awayTeam;
	private int awayGoals;
	private int stadiumId;
	private Referee refereeId1;
	private Referee refereeId2;
	private Referee refereeId3;
	
	public Match(Team homeTeam, int homeGoals,Team awayTeam,int awayGoals, Referee refereeId1,Referee refereeId2,Referee refereeId3,int stadiumId) {
		this.homeTeam=homeTeam; // standart constructor
		this.homeGoals=homeGoals;
		this.awayTeam=awayTeam;
		this.awayGoals=awayGoals;
		this.stadiumId=stadiumId;
		this.refereeId1=refereeId1;
		this.refereeId2=refereeId2;
		this.refereeId3=refereeId3;
		
		
	}

	public Team getHomeTeam() {return homeTeam;} // getters

	public int getHomeGoals() {return homeGoals;}

	public Team getAwayTeam() {return awayTeam;}

	public int getAwayGoals() {return awayGoals;}

	public int getStadiumId() {return stadiumId;}

	public Referee getRefereeId1() {return refereeId1;}
	public Referee getRefereeId2() {return refereeId2;}
	public Referee getRefereeId3() {return refereeId3;}
	
	public String result(String homeTeam,int homeGoals,String awayTeam,int awayGoals) {
		if(homeGoals>awayGoals) {  // when this method called in main taking int values and comparing them and deciding the result
			return homeTeam;      // after that returning a string name of the team if a side won or draw 
			}
		
		if(homeGoals<awayGoals) {
			return awayTeam;
			}
		else 
			return "draw";
	}
	
	

}
//home-team;numberofgoals;away-team;numberofgoals;refereeID;refereeID;refereeID;stadiumID

package footballManagementSystem;

public class Team { // attributes for team which include counters for elements of team
	private static int Id=1;
	private static int count=0;
	private static int pcount=0;
	private static int ccount=0;
	private int teamId;
	private String name;
	private int year;
	private int cups;
	private String colors;
	private Coach[] coaches=new Coach[10];
	private Player[] players=new Player[30];
	private Company[] companies=new Company[10];
	private  int score=0;
	public Team(String name,int year,int cups,String colors) { // standart constructor for team and increment id
		this.name=name;
		this.year=year;
		this.cups=cups;
		this.colors=colors;
		teamId=Id;
		Id++;
	}
	public Team(String name) { // constructor when only input is name
		this.name=name;
		

	}
	
	
	public void addCoach(Coach coach) { // when adding a coach in main we should add it to team class too for that created a coaches array
		coaches[count] = coach;		   // and a count for coach each them this method is called adding it to this array and incrementing id
		count++;                      // when we need team coach we can call it from getCoaches() thanks to this structure
		}
	public void addPlayer(Player player) { // same with coach and company
		players[pcount] = player;		
		pcount++;
		}
	public void addCompany(Company company) { // same with player and coach
		companies[ccount] = company;		
		ccount++;
		}
	
	public int getId() {return teamId;} // getters 
	public String getName() {return name;}
	
	public int getScore() {return score;}
	

	public void ScoreWin() { // when a team won a match increasing score of that team 3
		score=score+3;
	}
	public  void ScoreDraw() { // when a team draw a match increasing score of that team 1 
		score=score+1;
	}
	public int getYear() {return year;}
	
	public int getCups() {return cups;}

	public String getColors() {	return colors;}

	public Coach[] getCoaches() {return coaches;}

	public Player[] getPlayers() {	return players;}

	public Company[] getCompanies() {return companies;}
		
}
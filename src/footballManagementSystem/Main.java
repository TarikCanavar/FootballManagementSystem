package footballManagementSystem;

import java.io.*;

public class Main {

	public static void main(String[] args) {		
		String[] info = new String[100];
	
		Team[] teamArray = new Team[100]; //Arrays for classes
		int teamCount = 0;
		Coach[] coachArray = new Coach[100];
		int coachCount=0;
		Stadium[] stadiumArray = new Stadium[100];
		int stadiumCount=0;
		Company[] companyArray = new Company[100];
		int companyCount=0;
		Player[] playerArray = new Player [630];
		int playerCount=0;
		Referee[] refereeArray = new Referee [100];
		int refereeCount=0;
		Match[] matchArray = new Match [100];
		int matchCount=0;
		int[] capacityCompare= new int[100];
		int i = 0;
		Coach[] coachHolder =new Coach[100];
		try {
			File file = new File("E:input.txt");  // file reading part
			
			BufferedReader read = new BufferedReader(
			new InputStreamReader(
			new FileInputStream(file), "UTF8"));
			String str;

			while ((str = read.readLine()) != null) {
			//System.out.println(str);
			info[i] = str;
			i++;
			}

			read.close();
			}
			catch (UnsupportedEncodingException e)
			{
			System.out.println(e.getMessage());
			}			
			catch (Exception e)
			{
			System.out.println(e.getMessage());
			}
		

			for(int t=0;t<info.length ;t++) {  
				
				if (info[t]!=null){//  for loop for processing the input  
					
		String[] holder = info[t].split(";");  
		// splitting the input in each line and taking that input to holder array
		if(holder[0].equals("AddTeam")) {
			teamArray[teamCount]=new Team(holder[1],Integer.parseInt(holder[2]),Integer.parseInt(holder[3]),holder[4]);
			teamCount++;
		}
		if(holder[0].equals("AddCoach")) {	// if input is coach we are taking the input to class types and after that controlling 
			                                 // if the date is valid or not then taking input to coach array and adding coach to team.
					
             Address a= new Address(holder[2],holder[3],holder[4],holder[5]);
             Phone p= new Phone(holder[6],holder[7],holder[8]);
             Date sD= new Date(Integer.parseInt(holder[10]),Integer.parseInt(holder[11]),Integer.parseInt(holder[12]));
             Date eD= new Date(Integer.parseInt(holder[13]),Integer.parseInt(holder[14]),Integer.parseInt(holder[15]));
             Team teamCoach= new Team(holder[9]);
             Coach coachTeam= new Coach(holder[1]);
             if(sD.validDate()&&eD.validDate()==false) {
            	 System.out.println("Invalid date!!");;}
             else if ((Integer.parseInt(holder[12])==(Integer.parseInt(holder[15]))&&Integer.parseInt(holder[11])== Integer.parseInt(holder[14]))&& (Integer.parseInt(holder[10])) >= (Integer.parseInt(holder[13]))) {
             	System.out.println("Invalid date!!");//when year and month is same controlling if day is bigger or smaller
                      }
             else if((Integer.parseInt(holder[12])==(Integer.parseInt(holder[15]))&&Integer.parseInt(holder[11])> Integer.parseInt(holder[14]))         ) {
             	System.out.println("Invalid date!!");// when year is same but start month is bigger than end month
             }
             else {
			coachArray[coachCount]=new Coach(holder[1],a,p,teamCoach,sD,eD,Integer.parseInt(holder[16]));			
			for(int j=0;j<teamCount;j++)
			{
				if(teamArray[j].getName()== holder[9])
				{
					teamArray[j].addCoach(coachArray[coachCount]);
		        }                 
			}
			coachHolder[coachCount]= coachTeam;
			coachCount++;
		}
             }
		if(holder[0].equals("AddPlayer")) { // if input is player taking the input to class types then controlling date is valid
			Address a= new Address(holder[7],holder[8],holder[9]); //then taking the player to array and adding to team
            Phone p= new Phone(holder[10],holder[11],holder[12]);
            Date bD= new Date(Integer.parseInt(holder[3]),Integer.parseInt(holder[4]),Integer.parseInt(holder[5]));
            Date sD= new Date(Integer.parseInt(holder[14]),Integer.parseInt(holder[15]),Integer.parseInt(holder[16]));
            Date eD= new Date(Integer.parseInt(holder[17]),Integer.parseInt(holder[18]),Integer.parseInt(holder[19]));
            Team teamPlayer= new Team(holder[13]);
            if(sD.validDate()&&eD.validDate()&&bD.validDate()==false) {
            	System.out.println("Invalid date!!");// invalid dates like 30 February or 31.06
                    }
            else if ((Integer.parseInt(holder[16])==(Integer.parseInt(holder[19]))&&Integer.parseInt(holder[15])== Integer.parseInt(holder[18]))&& (Integer.parseInt(holder[14])) >= (Integer.parseInt(holder[17]))) {
            	System.out.println("Invalid date!!");//when year and month is same controlling if day is bigger or smaller
                     }
            else if((Integer.parseInt(holder[16])==(Integer.parseInt(holder[19]))&&Integer.parseInt(holder[15])> Integer.parseInt(holder[18]))         ) {
            	System.out.println("Invalid date!!");// when year is same but start month is bigger than end month
            }
            else {
			playerArray[playerCount]= new Player(Integer.parseInt(holder[1]),holder[2],bD,holder[6],a,p,teamPlayer,sD,eD,Integer.parseInt(holder[20]),holder[21]);
			for(int j=0;j<teamCount;j++) {
				if(teamArray[j].getName()== holder[13]) {
					teamArray[j].addPlayer(playerArray[playerCount]);
				}
			}
			}
			playerCount++;
		}
		if(holder[0].equals("AddStadium")) { // if input is stadium no control just taking it to array and storing capacity info to array
			stadiumArray[stadiumCount]= new Stadium(holder[1],holder[2],Integer.parseInt(holder[3]),Boolean.parseBoolean(holder[4]),holder[5]);
			capacityCompare[stadiumCount]= Integer.parseInt(holder[3]);
			stadiumCount++;
			
		}		
		if(holder[0].equals("AddCompany")) { // for company taking input the class types and adding to company array after that adding to team
			Address a= new Address(holder[2],holder[3],holder[4],holder[5]);
            Phone p= new Phone(holder[6],holder[7],holder[8]);
            Team teamComp= new Team(holder[9]);
            companyArray[companyCount]= new Company(holder[1],a,p,teamComp);
            for(int j=0;j<teamCount;j++) {
				if(teamArray[j].getName()== holder[9]) {
					teamArray[j].addCompany(companyArray[companyCount]);
				}
			}
            companyCount++;
		}
		
		if(holder[0].equals("AddReferee")) { // for referee taking the input to class types after to referee array
			Address aRef= new Address(holder[2],holder[3],holder[4],holder[5]);
            Phone pRef= new Phone(holder[6],holder[7],holder[8]);
            refereeArray[refereeCount]= new Referee(holder[1],aRef,pRef,Integer.parseInt(holder[9]));
            refereeCount++;
			}
		
		
		if(holder[0].equals("AddMatch")) { // controlling score , stadium and referee if they are all right then same process
			if(Integer.parseInt(holder[2])<0||Integer.parseInt(holder[4]) < 0) {
				System.out.println("Wrong input : negative score is impossible");
			}else if(stadiumArray[Integer.parseInt(holder[8])-1]==null){
				System.out.println("Wrong input : stadium not created ");
			}
			else if((refereeArray[Integer.parseInt(holder[5])-1]==null)||refereeArray[Integer.parseInt(holder[6])-1]==null||refereeArray[Integer.parseInt(holder[7])-1]==null){
				System.out.println("Wrong input : referee not created");
			}
			else
			{				
				 Team homeTeam= new Team(holder[1]);                    // taking input to class types
				 Team awayTeam= new Team(holder[3]);
			 Referee referee1=new Referee(Integer.parseInt(holder[5]));
			 Referee referee2=new Referee(Integer.parseInt(holder[6]));
			 Referee referee3=new Referee(Integer.parseInt(holder[7]));
			
			 matchArray[matchCount]= new Match(homeTeam,Integer.parseInt(holder[2]),awayTeam,Integer.parseInt(holder[4]),referee1,referee2,referee3,Integer.parseInt(holder[8]));
			 String Result= matchArray[matchCount].result(holder[1],Integer.parseInt(holder[2]),holder[3],Integer.parseInt(holder[4]));
			if(Result.equals("draw")) { // using result method in match class to find out who won or is it draw 
				  for(int x=0;x<teamCount;x++) {                      // if result is draw then calling our score methods to increase their score 1 
                         if(teamArray[x].getName().equals(holder[1])) {
                        	 teamArray[x].ScoreDraw();
                         }
                         if(teamArray[x].getName().equals(holder[3])) {
                        	 teamArray[x].ScoreDraw();
                         }
                   }				
			}
			else if(Result.equals(holder[1])) {     // if result is equal to first team name then increasing that teams score 3
				 for(int x=0;x<teamCount;x++) {                      // if result is draw then calling our score methods to increase their score 1 
                     if(teamArray[x].getName().equals(holder[1])) {
                    	 teamArray[x].ScoreWin();
                     }
                     
}
			}
			else if(Result.equals(holder[3])) { // if result is equal to second team name then increasing that teams score 3

				 for(int x=0;x<teamCount;x++) {                      // if result is draw then calling our score methods to increase their score 1 
                     if(teamArray[x].getName().equals(holder[3])) {
                    	 teamArray[x].ScoreWin();
                     }
				 }
			}
			 matchCount++;
						 
		}
	}
		if(holder[0].equals("deletePlayer")) { // moving through player array when we have a match to license number assigning it to null
			for(int x=0;x<playerArray.length;x++) {
				if(Integer.parseInt(holder[1])==(playerArray[x].getLicenseNumber())) {
					playerArray[x]=null;
				}
			}
		}			
}
}
			System.out.println("League Table" ); // printing league table with teams and their final score 
			for(int x=0;x<teamCount;x++) {
				System.out.println(teamArray[x].getName()+" "+teamArray[x].getScore());
				}
			System.out.println("");
			 int scoreArray[] = new int[100];
			 for(int x=0;x<teamCount;x++) {
				 scoreArray[x]=teamArray[x].getScore();
			 }
			 int maxScore= scoreArray[0]; 
			 String maxScoreTeam="Çalýþmýyor :(";
				for(int x=0;x<teamCount;x++){ 
					if(scoreArray[x]>maxScore) { 
					scoreArray[x]=maxScore;
									
					}		
				}
				for(int x=0;x<teamCount;x++) {
					if(teamArray[x].getScore()==maxScore) {
						maxScoreTeam=teamArray[x].getName();
					}
				}
				
				System.out.println("Max point in the league is "+maxScore);
				System.out.println("Winner : "+maxScoreTeam);
				System.out.println("");
			 
			
			
			
			for(int x=0;x<teamCount;x++) { // moving in bound of teamCount and printing all teams with the info
			
			if(teamArray[x]!=null) {				
				System.out.println(teamArray[x].getName()+" Foundation Year: "+teamArray[x].getYear()+" Cups : "+teamArray[x].getCups()+" Colors : "+teamArray[x].getColors()+" Coach : "+coachHolder[x].getName());
			}
		}
			System.out.println("");
		for(int x=0;x<playerCount;x++) { // moving in bound of playerCount and printing info of players with getters
			if(playerArray[x]!=null) {
				System.out.println(playerArray[x].getName()+" Position : "+playerArray[x].getPositionalRole()+" Salary :"+playerArray[x].getSalary()+"  Phone number : "+playerArray[x].getPlayerPhones().getCountryCode()+" "+playerArray[x].getPlayerPhones().getAreaCode()+" "+playerArray[x].getPlayerPhones().getNumber()+" Nationality : "+playerArray[x].getNationality()+" Team of the player : "+playerArray[x].getTeam().getName());
			}
		}
		System.out.println("");
		for(int x=0;x<companyCount;x++) { // moving in bound of companyCount and printing info and team of company with getters
			if(companyArray[x]!=null) {
				System.out.println(companyArray[x].getName()+"  Phone number of the company : "+companyArray[x].getCompPhones().getCountryCode()+" "+companyArray[x].getCompPhones().getAreaCode()+" "+companyArray[x].getCompPhones().getNumber()+" Team of the company : "+companyArray[x].getCompanyTeam().getName());
			}
		}
		System.out.println("");
		int refSalary[]= new int[100]; // taking salary info to salary array and increasing them 
		for(int x=0;x<refereeCount;x++) {
	    refSalary[x]=refereeArray[x].getSalary();
	    refSalary[x]=((refSalary[x]*110)/100); 
		}
		for(int x=0;x<refereeCount;x++) { // moving in bound of refereeCount and printing name with increased salary
			if(refereeArray[x]!=null) {
				System.out.println("Name of the referee : "+refereeArray[x].getName()+"----> %10 increased salary of the referee: "+refSalary[x]);
			}
		}
		System.out.println("");
		int max= capacityCompare[0]; // for capacity creating an array and after that moving in bound of stad count 
		for(int x=0;x<stadiumCount;x++){ // if max is lower than the element in for loop then new max is it
			if(max<capacityCompare[x]) { 
			max=capacityCompare[x];
			}			
		}
		String maxCapacityStadium="";
		for(int x=0;x<stadiumCount;x++) {
			if(stadiumArray[x].getCapacity()==max) {
				maxCapacityStadium=stadiumArray[x].getName();
			}
		}
		
		System.out.println("");
		
		System.out.println("Biggest capacity  stadiums is : "+maxCapacityStadium+" with "+max+" capacity "); // printing the max we found up there
		
	}
}


    
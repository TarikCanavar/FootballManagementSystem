package projectX;

import java.util.Random;

public class Date {
	private int day;
	private int month;
	private int year;
	
	public Date(int day,int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public int getDay() {
		return day;
	}
	public int getMonth() {
		return month;
	}
	public int getYear() {
		return year;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
    public void nextDay() {
    	if(day < 31 && (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 )) {
    		day++;
    	}
    	else if(day == 31 && (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 ))  { 	
    		month++; 
    		day = 1;
    	}  	
    	else if(day < 31 && month == 12) {  
    		day++; 
    	}   	
    	else if(day == 31 && month == 12) {
    		year++; day = 1; month = 1; 
    	}		
    	
    	else if(day < 30 && (month == 4 || month == 6 || month == 9 || month == 11)) {
    		day++;
    	}
    	else if(day == 30 && (month == 4 || month == 6 || month == 9 || month == 11)) { 
    		day = 1; 
    		month++; 
    	}
    		
    	else if(day < 28 && month == 2) { 
    		day++; 
    		}   
    	else if (day == 28 && month == 2) { 	
    		day = 1; 
    		month++; 
    	}       	   	    	
    }
    public int[] addKm(Car[] cars) {
    	Random random = new Random();
    	int[] kmAdded = new int[Car.getId() - 1]; 
    	for(int i = 0; i < Car.getId() - 1; i++) {
    		int rand = random.nextInt(3);
    		if(!cars[i].getStatus()) {
    			if(rand == 0) {
    				cars[i].setKm(100);
    				kmAdded[i] = 100;
    			}    				
        		else if(rand == 1){
        			cars[i].setKm(200);
        			kmAdded[i] = 200;
        		}
        		else {
        			cars[i].setKm(300);
        			kmAdded[i] = 300;
        		}
    		}
    	}    	
    	return kmAdded;
    }
 // Method used to check if the date is correct.
 	public boolean IsDateValid() {
 		boolean IsValid = false;
 		
 		if ((month % 2 == 1 && month != 2) || month == 8 || month == 10 || month == 12) {
 			if (day <= 31 && day >= 0) {
 				IsValid = true;
 			}
 		}
 		else if ((month % 2 == 0 && month != 2) || month == 9 || month == 11) {
 			if (day <= 30 && day >= 0) {
 				IsValid = true;
 			}
 		}
 		else if (month == 2) {
 			if (year % 4 == 0) {
 				if (day <= 29 && day >= 0) {
 					IsValid = true;
 				}
 			}
 			else {
 				if (day <= 28 && day >= 0) {
 					IsValid = true;
 				}
 			}
 		}
 		return IsValid;
 	}
 	
 	// Method used to check if the contract date format is correct.
 	public static boolean IsContractDateValid(Date date1 ,Date date2) {
 		boolean IsValid = false;
 		
 		// If year of the start date is lower than then end date, contract date is valid.
 		if (date1.getYear() <date1.getYear()) {
 			IsValid = true;
 		}
 		else if(date1.getYear() == date2.getYear()) {
 			if(date1.getMonth() < date2.getMonth()) {
 				IsValid = true;
 			}
 			else if(date1.getMonth() == date2.getMonth()) {
 				if(date1.getDay() < date2.getDay() && date2.getDay() - date1.getDay() <= 4) {
 					IsValid = true;
 				}
 			}
 		}
 		return IsValid;
 	}
 	public String getAllInfo() {
        String info = day + "." + month + "." + year;
        return info;
    }
    
}

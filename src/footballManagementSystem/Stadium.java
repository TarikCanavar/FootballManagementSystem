package footballManagementSystem;

public class Stadium { // attributes for stadium class
	private static int Id = 1;
	private String name;
    private String city;
    private int capacity;
    private Boolean lighting;
    private String surface;
    private int StadiumId;
    
    public Stadium(String name,String city,int capacity,Boolean lighting,String surface) {
    	this.name=name;        // standart constructor and incrementing id for each stadium
    	this.city=city;
    	this.capacity=capacity;
    	this.lighting=lighting;
    	this.surface=surface;
    	StadiumId=Id;
    	Id++;
    }
    public Stadium(int StadiumId) {}        // getters for stadium
    public int getStadiumId() {return StadiumId;}
	public String getName() {return name;}
	public String getCity() {return city;}
	public int getCapacity() {return capacity;}
	public Boolean getLighting() {return lighting;}
	public String getSurface() {return surface;}
	}


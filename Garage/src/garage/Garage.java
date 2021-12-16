package garage;

public class Garage {
	private String location;
	public static int MAX_SPACES=3;
	private Car[] spaces;
	private int numOfSpaces;
	
	Garage(String location){
		this.location=location;
		spaces=new Car[MAX_SPACES];
	}
	public boolean addCar(Car car) {
		if(numOfSpaces < MAX_SPACES) {
		spaces[numOfSpaces]=car;	
		numOfSpaces++;
		return true;
		}else {
		return false;
		}
	}
	public String getCar(int x) {return spaces[x].toString();}
	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	public String toString() {

		return "Garage Address: "+ this.location+"\n\nCars in the gararage ";
	}
	
	
	
}

package university;

public class Person {
	private int gNum;
	private String fName;
	private String lName;
	
	Person(){}
	Person(int g, String f, String l){
		this.gNum=g;
		this.fName=f;
		this.lName=l;
	}
	
	public void setGNum(int gNum) {this.gNum=gNum;}
	public void setFName(String fName) {this.fName=fName;}
	public void setLName(String lName) {this.lName=lName;}
	
	public int getGNum() {return this.gNum;}
	public String getFName() {return this.fName;}
	public String getLName() {return this.lName;}
	
	public String toString() {
		
		return "Gnumber "+this.gNum+" "+this.fName+" "+this.lName;
	}
}

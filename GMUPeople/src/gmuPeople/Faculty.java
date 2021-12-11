package gmuPeople;

public class Faculty extends Person{
	private String department;
	private int teachLoad;
	
	Faculty(){}
	Faculty(int gn, String fn, String ln,String d, int t){
		super(gn,fn,ln);
		this.department=d;
		this.teachLoad=t;
	}
	public void setTeachload(int t) { this.teachLoad=t;}
	public void setDepartment(String d) {this.department=d;}
	
	public int getTeachLoad() {return this.teachLoad;}
	public String getDepartment() {return this.department;}
	
	public String toString() {
		return super.toString()+" "+this.department+" "+this.teachLoad;
	}
}

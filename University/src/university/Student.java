package university;

public class Student  extends Person{
	private String major;
	private double GPA;
	
	Student(){}
	Student(int gn, String fn, String ln,String m, double gpa){
		super(gn,fn,ln);
		this.major=m;
		this.GPA=gpa;
		}
	
	public void setGPA(double g) { this.GPA=g;}
	public void setMajor(String m) {this.major=m;}
	
	public double getGPA() {return this.GPA;}
	public String getMajor() {return this.major;}
	
	public String toString() {
		return super.toString()+" "+this.GPA+" "+this.major;
	}
}

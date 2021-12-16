package university;

public class Course {
	private String courseName;
	private Instructor intructor;
	private Textbook textbook;
	private Undergraduate [] student;
	public static final int MAX_NUM_STUDENT=4;
	private int numberOfStudents=0;
	
	Course(String courseName, Instructor in, Textbook text){
		this.courseName=courseName;
		this.intructor=in;
		this.textbook=text;
		student = new Undergraduate [ MAX_NUM_STUDENT];
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public Textbook getTextbook() {
		return textbook;
	}
	public void setTextbook(Textbook textbook) {
		this.textbook = textbook;
	}
	public boolean addStudent(Undergraduate stu) { 
		if(numberOfStudents < MAX_NUM_STUDENT) {
			student[numberOfStudents++]=stu;
			return true;
		}
			return false;
	}
	public String getStudent(int x) { 
		return student[x].toString(); 
		}
	public String toString() {
		return "\nCourse Name :"+this.courseName+
				"\nInstructor "+this.intructor.toString()+
				"\nTextbook :"+this.textbook.toString();
	}
}

package university;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Textbook book= new Textbook("Porgramming 1","9th edition");
		Instructor professor = new Instructor("Miriam","Pantoja","1090");
		Undergraduate student1=new Undergraduate(9, "Nelly","Billions","Information Technology", 3.0,true);
		Undergraduate student2=new Undergraduate(8, "Tessa","Dealen","Information Technology", 3.9,true);
		Undergraduate student3=new Undergraduate(7, "Jenny","White","Information Technology", 2.7,true);
		Undergraduate student4=new Undergraduate(6, "Bobby","Brown","Information Technology", 2.9,true);
		Course course = new Course("Porgramming 201", professor, book);
		course.addStudent(student1);
		course.addStudent(student2);
		course.addStudent(student3);
		course.addStudent(student4);
		
		String students="";
		for(int x=0; x < course.MAX_NUM_STUDENT;x++) {
			 students+=course.getStudent(x)+"\n";
		}
		
		System.out.println(course.toString()+"\n\nStudents in the class\n"+students);
	}

}

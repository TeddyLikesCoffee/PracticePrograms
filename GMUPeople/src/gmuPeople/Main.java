package gmuPeople;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Faculty teacher= new Faculty(123456,"Miriam","Pantoja","Computer Science", 1);
		Student Nelly = new Undergraduate(23456, "Nelly", "Pantoja","IT", 3.6,true);
		Student Esteban= new Graduate(34567,"Esteban","Pantoja","IT",3.4,"programming",true);
		
		System.out.println(teacher.toString());
		System.out.println(Nelly.toString());
		System.out.println(Esteban.toString());
	}

}

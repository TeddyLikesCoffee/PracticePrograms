package university;

public class Instructor {
	private String firstName;
	private String lastName;
	private String officeNumber;
	
	Instructor(String fn, String ln, String on){
		this.firstName=fn;
		this.lastName=ln;
		this.officeNumber=on;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getOfficeNumber() {
		return officeNumber;
	}

	public void setOfficeNumber(String officeNumber) {
		this.officeNumber = officeNumber;
	}
	
	public String toString() {
		return ": "+getFirstName()+" "+getLastName()+"\nOffice Number :"+getOfficeNumber();
	}
}

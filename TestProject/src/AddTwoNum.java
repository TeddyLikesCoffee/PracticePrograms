
public class AddTwoNum {
	private int numOne;
	private int numTwo;
	
	//constructors
	AddTwoNum(){
		
	};
	AddTwoNum(int x, int y){
		this.numOne=x;
		this.numTwo=y;
	}
	
	//Mutator
	public void setNumOne(int number) { this.numOne=number; }
	public void setNumTwo(int number) { this.numTwo=number; }
	
	//Accessor
	public int GetNumOne() {return this.numOne; }
	public int GetNumTwo() {return this.numTwo; }
	
	//special purpose methods
	public int addition(int one, int two) {
		return one + two;
	}
	
	public void printNums() {
		System.out.print("Two numbers: " +this.numOne +" "+ this.numTwo+"\n");
	}



}

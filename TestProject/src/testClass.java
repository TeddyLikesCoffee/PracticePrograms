import java.io.*;
import java.util.Scanner;


public class testClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int MAX = 3;
		//AddTwoNum [] nums= new AddTwoNum[MAX]; 
		//addNumbers(nums,MAX);
		AddTwoNum test= new AddTwoNum();
		System.out.println(test.toString());
	}
	public AddTwoNum [] printNumbers(int [] x) {
		 AddTwoNum [] numbers = new AddTwoNum[x.length];
		 for(int i=0; i < x.length; i++) {
			 
		 }
		 
		 return numbers;
	}
	public static void addNumbers(AddTwoNum [] w,int m){
		 AddTwoNum [] num= new AddTwoNum[m];
	
		for(int x=0; x<m; x++) {
			
			System.out.print("Enter num one: ");
			Scanner n1= new Scanner(System.in);
			int num1=n1.nextInt();
			
			System.out.print("Enter num two: ");
			Scanner n2= new Scanner(System.in);
			int num2=n2.nextInt();
			
			num[x]= new AddTwoNum();
			num[x].setNumOne(num1);
			num[x].setNumTwo(num2);
			
			num[x].printNums();

		}
	}

}

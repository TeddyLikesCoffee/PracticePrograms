package MowingBusinessPackage;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("What is the radious?");
		int userInput=input.nextInt();
		
		DataClass firstGig=new DataClass();
		double areaCalc=firstGig.calculateArea(userInput);
		System.out.print(" Total : "+firstGig.calculatePrice( areaCalc, 2));
		
	}

}

package basketballTournament;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teams [] teams = new Teams[1]; 
		int counter=0;
		int exit;
		int num=0;
		do {
		teams[counter]=new Teams(); 
		
		System.out.print("Enter the Teams name: ");
		Scanner n= new Scanner(System.in);
		String name=n.next();
		teams[counter].setName(name);
		
		System.out.print("Enter the Teams email: ");
		Scanner em= new Scanner(System.in);
		String email=em.next();
		teams[counter].setEmail(email);
		
		do {
		
		System.out.print("Enter Player name: ");
		Scanner pn= new Scanner(System.in);
		String playerName=pn.next();
		
		System.out.print("Enter Player gpa: ");
		Scanner pg= new Scanner(System.in);
		double playerGpa=pg.nextDouble();
		
		if(teams[counter].setAPlayer(playerName, playerGpa)) {
			 num= 1;
			 
		  }else {
			 num= 2;
		  }

		}while(num<2);
		
		System.out.print("To add another team enter 2 or 1 to exit: ");
		Scanner e= new Scanner(System.in);
		exit=e.nextInt();
		
		}while(exit!=1);
		
		
		for(int j=0; j < teams.length; j++) {
			System.out.print(teams[j].toString());
			//System.out.print(j);
		}
	}

}

package bankAccounts;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckingAccount check = new CheckingAccount("Little Miriam",1000);
		check.withdrawls(501);
		System.out.print(check.toString()+"\nTransaction History");
		check.printHistory();
		
		SavingsAccount check1= new SavingsAccount("Savings Account", 20000);
		check1.withdrawls(100);
		System.out.print(check1.toString());
	}

}

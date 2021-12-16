package bankAccounts;

public class CheckingAccount extends BankAccount {
	private final int MAX_CHECKS=3;
	private double [] transactions = new double[MAX_CHECKS];
	private int counter=0;
	CheckingAccount(String an, double d){
		super(an, d);
	  }	
	
	public boolean withdrawls(double amount){
		double currentAmount;
		if(counter<transactions.length & super.getDeposit() > amount) {
			currentAmount=super.getDeposit() - amount;
			super.setDeposit(currentAmount);
			transactions[counter]=amount;
			counter++;
			return true;
			
		}
		return false;
	}
	public void printHistory() {
		for(int x=0;x<=counter ;x++ ) {
			
			System.out.print("\n"+transactions[x]);
			
		}
	}
	
	public String toString() {
		return super.toString();
	}
	
}

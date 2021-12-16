package bankAccounts;

public class SavingsAccount extends BankAccount{
	private int MAX_WITHDRAWLS=6;
	private int counter=0;
	SavingsAccount(String an, double d){
		super(an,d);
	}
	
	public boolean deposit(double amount) {
		if(amount > 0.0) {
		double bonus= amount*(1/100);
		super.setDeposit(amount+bonus);
		return true;
		}else {
			return false;
		}
	}
	public boolean withdrawls(double amount) {
		double deposit=super.getDeposit();
		if(counter < MAX_WITHDRAWLS & amount < deposit ) {
			super.setDeposit(deposit-amount);
			return true;
		}
			return false;
	}
	
	public String toString() {
		return super.toString()+"\nNumber Withdrawls: "+(int)this.counter+1;
	}
}

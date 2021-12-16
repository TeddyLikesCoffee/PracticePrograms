package bankAccounts;

public abstract class BankAccount {
	private String accountName; 
	private double deposit=0.0;
	
	BankAccount(String an, double d){
		this.accountName=an;
		this.deposit=d;
	}
	
	public void setAccountName(String an) { this.accountName=an;}
	public void setDeposit(double d) {this.deposit=d;}
	
	public String getAccountName() {return this.accountName;}
	public double getDeposit() {return this.deposit;}
	
	public boolean withdrawls(double amount) {
		if(deposit > amount){
			deposit-=amount;
			return true;
		}else {
		return false;
		}
	}
	
	public String toString() {
		return "\nAccount Name:"+ this.accountName+
				"\nBalance :$"+this.deposit;
	}
}

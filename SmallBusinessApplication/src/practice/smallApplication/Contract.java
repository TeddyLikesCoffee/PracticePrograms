package practice.smallApplication;

public abstract class Contract {
	//private Contract [] numOfContract;
	private double charge;
	private String clientAddress;
	private int counter=0;
	private double liquid;
	
	Contract(String ca){
		//this.charge=c;
		this.clientAddress=ca;
		//numOfContract=new Contract[counter++];
	}

	public double getCharge() {
		return charge;
	}

	public void setCharge(double charge) {
		this.charge = charge;
	}

	public String getClientAdd() {
		return clientAddress;
	}

	public void setClientAdd(String clientAdd) {
		this.clientAddress = clientAdd;
	}
	
	public abstract void calculateCharge(int x);
	public abstract void liquid();
	
	public double getLiquid() {
		return liquid;
	}

	public void setLiquid(double liquid) {
		this.liquid = liquid;
	}

	public String toString() {
		return "\nClient Address :"+this.clientAddress+"\nCharge :$"+this.charge;
	}
}

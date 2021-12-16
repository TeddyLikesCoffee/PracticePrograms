package practice.smallApplication;

public class Pool extends Contract{
	Pool( String ca){
		super(ca);
	}
	
	public void calculateCharge(int x) {
		if(x<2) {
			super.setCharge(50);
		}else {
			super.setCharge(60);
		}
	};
	public void liquid() {
		super.setLiquid(0.25);
	};
	public void triming(boolean x) {
		if(x) {
			super.setCharge(super.getCharge()+10);
		}
	}
	
	public String toString() {
		return "\n####Pool Service####"+super.toString()+"\nGas :"+super.getLiquid()+" gallon";
	}
}

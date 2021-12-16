package practice.smallApplication;

public class Grass extends Contract{
	private final int BASE_FEE=10; 	
	private double cleanPool;
	Grass( String ca){
		super(ca);
	}
	public void calculateCharge(int service) {
		if(service<2) {
			cleanPool=40.0;
			super.setCharge(BASE_FEE+cleanPool);
		}else {
			double chemicalTreatment=20;
			super.setCharge(BASE_FEE+chemicalTreatment);
		}
	};
	
	public void liquid() {
		super.setLiquid(0.5);
	};
	
	public String toString() {
		return "\n####Lawn Service#####"+super.toString()+"\nChemicals :"+super.getLiquid()+" gallon";
	}
}

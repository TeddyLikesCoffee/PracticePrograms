package gmuPeople;

public class Graduate extends Student {
    private String concentration;
    private boolean GTAEligibility;
    
    Graduate(int gn, String fn, String ln,String m, double gpa,String c, boolean gta){
    	super(gn,fn,ln,m,gpa);
    	this.concentration=c;
    	this.GTAEligibility=gta;
    }
    
    
	public void setGTAEligibility(boolean g) { this.GTAEligibility=g;}
	public void setContration(String c) {this.concentration=c;}
	
	public boolean getGTAEligibility() {return this.GTAEligibility;}
	public String getConcentration() {return this.concentration;}
	
	public String toString() {
		return super.toString()+"\n Concentration "+this.concentration+"\n GTA Eligibility:"+this.GTAEligibility;
	}
}

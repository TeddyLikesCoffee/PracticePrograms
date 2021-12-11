package gmuPeople;

public class Undergraduate extends Student {
	private boolean scholrshipEligibilty;
	
	 Undergraduate(int gn, String fn, String ln,String m, double gpa,boolean se){
		 super(gn,fn,ln,m,gpa);
		 this.scholrshipEligibilty=se;
	 }
	 
		public void setScholrshipEligibilty(boolean se) {this.scholrshipEligibilty=se;}
		
		public boolean getScholrshipEligibilty() {return this.scholrshipEligibilty;}
		
		public String toString() {
			return super.toString()+"\n Scholarship Eligibility: "+this.scholrshipEligibilty;
			
		}
}

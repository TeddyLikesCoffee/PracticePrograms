package gmuPeople;

public class Project {
	private String name;
	private double numMonths;
	private Site site;
	private Graduate [] grad;
	private static final int MAX_NUM_CONTRACTORS=5;
	
	Project(String name, double numMonths,String street, String city, String state, String zip,Graduate [] grad){
		Site sites= new Site(street,city,state,zip);
		this.name=name;
		this.numMonths=numMonths;
		for(int x=0;x<grad.length;x++) {
			this.grad[x]=grad[x];
		}
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getNumMonths() {
		return numMonths;
	}

	public void setNumMonths(double numMonths) {
		this.numMonths = numMonths;
	}

	public Site getSite() {
		return site;
	}

	public void setSite(Site site) {
		this.site = site;
	}

	public Graduate[] getGrad() {
		return grad;
	}

	public boolean setGrad() {
		//this.grad = grad;
		return true;
	}
}

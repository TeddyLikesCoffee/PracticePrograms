package magazineStand;

public class Magazine {
	private String title;
	private double cost;
	private int numInStock;
	private int counter;
	private double tax=.053;
	
	public Magazine() {
		this.cost=3.50;
		this.numInStock=10;
	}
	public boolean checkStock(){
		this.counter=numInStock;
		if(counter>0) {
			return true;
		}else {
			return false;
		}
   }
	
  public void sellMagazine() {
	  if (checkStock()) {
		  counter--;
		  double total= this.cost+this.tax;
		  System.out.print("Your total is: "+Math.round(total*100.0)/100.0);
	  }else {
		  System.out.print("we are out of stock");
	  }
  }
}

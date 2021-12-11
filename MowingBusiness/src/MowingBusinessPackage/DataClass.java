package MowingBusinessPackage;

public class DataClass {
    private double PI=3.14;
    private double total;
    private int radius;
	DataClass(){}
	
	public double calculateArea(int radius) {
		double area=0.0;
		area = PI* Math.pow(radius,2);
		return area;
	}
	public double calculatePrice(double calc,double total) {
		double cost;
		return cost = calc * total;	
	}
}

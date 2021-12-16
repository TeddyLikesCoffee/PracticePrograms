package garage;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1=new Car("Toyota","Corrolla");
		Car car2=new Car("Ford","Focus");
		Car car3=new Car("Toyota","Rav4");
		
		Garage garage = new Garage("4254 Leeburg Pike Alexandria, VA 22302");
		garage.addCar(car1);
		garage.addCar(car2);
		garage.addCar(car3);
		
		String cars="";
		for(int x=0; x < garage.MAX_SPACES;x++) {
			 cars+=garage.getCar(x);
		}
		
		System.out.print(garage.toString()+cars);
	}

}

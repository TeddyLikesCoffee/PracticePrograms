package practice.smallApplication;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		final int MAX_CONTRACTS=5;
		Object [] contract = new Object[MAX_CONTRACTS];
		
		//do {
		Grass  contract1= new Grass("3521 Leeburg Ct Apt 102 Alexandria, VA");
		contract1.calculateCharge(1);
		contract1.liquid();
		contract[0]=contract1;
		
		Pool  contract2= new Pool("707 Leeburg Alandria, VA");
		contract2.calculateCharge(1);
		contract2.triming(true);
		contract2.liquid();
		contract[1]=contract2;
		
		Grass  contract3= new Grass("3350 Leeburg Ct Apt 102 Alexandria, VA");
		contract3.calculateCharge(2);
		contract3.liquid();
		contract[2]=contract3;
		
		Pool  contract4= new Pool("9834 Leeburg Alandria, VA");
		contract4.calculateCharge(2);
		contract4.triming(true);
		contract4.liquid();
		contract[3]=contract4;
		//}while();
		System.out.println(Arrays.toString(contract));
		//System.out.println(contract1.toString()+"\n"+contract2.toString());
	}

}

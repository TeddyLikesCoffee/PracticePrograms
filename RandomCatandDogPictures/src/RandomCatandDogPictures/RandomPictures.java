package RandomCatandDogPictures;

import java.io.*;
import java.util.*;
public class RandomPictures {

	public static void main(String[] args){
		// TODO Auto-generated method stub
    try {
     File randPics = new File("C:\\Users\\Miriam\\Documents\\listOfPics.txt");
     Scanner readThroughFile= new Scanner(randPics);
     while(readThroughFile.hasNextLine()) {
    	 String data = readThroughFile.nextLine();
    	 System.out.println(data);
     }
     readThroughFile.close();
	}catch(FileNotFoundException e){
		System.out.println("An error has occured");
		e.printStackTrace();
	}
	}

}

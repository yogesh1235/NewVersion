package JavaProgram;

import java.util.Random;

public class GenrateRandomNumbString {

	public static void main(String[] args) {

		
		//Approach 1 - Random 
		
		Random rand  = new Random();
		int rand_int = rand.nextInt(100);
		
		System.out.println(rand_int);
		
		
		//Approach 2 - Math
		
		System.out.println(Math.random()); //Genrate only desimal numbers
		
		
		
		
	}

}

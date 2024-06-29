package JavaProgram;

import java.util.Scanner;

public class ReverseNumberInJava {

	public static void main(String[] args) {
	
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Write a number");
		
		int num = scn.nextInt();
		
		
		System.out.println(revNumberB(num));
		
		int rev=0;
		while(num!=0 ) {
			
			rev = rev*10 + num%10;   //  0*10 + 1234%10 = 4   
			num = num/10;  //1234/10= 123
			
		}
		
		
		
			
	}

	//Using StringBuffer class
	public static StringBuffer revNumber(int num) {
		
		StringBuffer str = new StringBuffer(String.valueOf(num));
		return str.reverse();
		
		
	}
	
	// Using StringBuilder class 
	
public static StringBuilder revNumberB(int num) {
		
		StringBuilder str = new StringBuilder(String.valueOf(num));
		return str.reverse();
		
		
	}
	
}

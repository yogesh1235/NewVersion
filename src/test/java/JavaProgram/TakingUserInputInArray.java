package JavaProgram;

import java.util.Scanner;

public class TakingUserInputInArray {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of element you want to enter ");
		int number = sc.nextInt();
		
		
		int[] arr = new int[number];
		System.out.println("Enter the number");

		for (int i=0; i <number; i++) {
			
			arr[i] = sc.nextInt();
			
			
		}
		
		
		for (int i=0; i <number; i++) {
			
			System.out.println(arr[i]);
		}
		
	}
	
	
	
}

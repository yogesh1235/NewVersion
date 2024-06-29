package JavaProgram;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		parlindromenum(num);

	}

	
	public static void parlindromenum(int num) {
		int rev =0; 
		 int temp = num;
		while (num!=0)
		{
		rev = rev*10+ num %10 ;
		num = num/10;
		
		}
		
		if (temp==rev ) {
			
			System.out.println("Number is pal");
				}
		
		else 
			System.out.println("Number is not pal");
		
		
		
	}
	
	
}

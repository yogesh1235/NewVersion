package JavaProgram;

import java.util.Scanner;

public class NumberofWordsinString {

	public static void main(String[] args) {
		 
		Scanner scn = new Scanner(System.in); 
		System.out.println("Please enter the String ");
		String str  = scn.nextLine();
			int numbeOfWords = StringWordCount(str);
System.out.println(numbeOfWords);
	}

	
	public static int StringWordCount(String str) {
		
		int flag=0;
		String[] string = str.split(" ");
		
		for(String words : string) {
			
			System.out.println(words);
			flag++;
			
			
		}
		
		return flag;
		
		
		
		
		
		
	}
	
}

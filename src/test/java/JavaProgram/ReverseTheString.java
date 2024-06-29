package JavaProgram;

import java.util.Scanner;

public class ReverseTheString {

	public static void main(String[] args) {
		
	//	System.out.println("Enter the string");
//		Scanner sc = new Scanner(System.in);
	//	String str = sc.nextLine();

		
	//	System.out.println(revC(str));
		
		System.out.println(revC("This is Yogesh"));
	}
	
	
	// using  + (String concatenation ) operator
	
	public static String revC(String str) {
		String rev = "" ; 
		
		for(int i=str.length()-1; i>=0; i--) {
			
			rev  = rev + str.charAt(i);
		}
		
		return rev;
			
	}
	
	//Using charArray
	
	public static String revA(String str) {
		String rev = "" ; 
		
		char[] a = str.toCharArray();
		
		for(int i=a.length-1; i>=0; i--) {
			
			rev  = rev + a[i];
		}
		
		return rev;
			
	}
	

public static void rev(String str){

char[] cha = str.toCharArray();

for(int i=cha.length-1 ; i>=0 ; i--){

System.out.print(cha[i]);

}
}}



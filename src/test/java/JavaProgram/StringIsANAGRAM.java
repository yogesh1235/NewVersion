package JavaProgram;

import java.util.Arrays;

public class StringIsANAGRAM {

	public static void main(String[] args) {

		
		String str1= "Stop" ;
		String str2 = "Pots"; 
		
		if (Anagram(str1 , str2))
		System.out.println("Strings are anagram");
		else
			System.out.println("Strings are not anagram");
		
		
		
	}

	public static boolean Anagram(String str1 , String str2) {
		

		char ch1[] = str1.toLowerCase().toCharArray(); 
		char ch2[] =  str2.toLowerCase().toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		if (Arrays.equals(ch1, ch2))
			return true;
		else 
			return false;
		
		
		
	}
	
	
}

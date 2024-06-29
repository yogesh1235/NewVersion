package JavaInterviewQuestions;

import java.io.PrintWriter;

public class CheckedAndUncheckedException {

	// Checked and unchecked exceptions 

	public static void main(String[] args) {
		
		PrintWriter pw = new PrintWriter("abc.text"); //CE: Unreported exception java.io.FileNotFoundException must be caught or declared to be thrown : Checked exception
		pw.println("ABC");
		
		System.out.println(10/0); //Exceptions which are not checked by the compiler are called unchecked exception
 		
		
		
		
		
	}
	
	
	
}

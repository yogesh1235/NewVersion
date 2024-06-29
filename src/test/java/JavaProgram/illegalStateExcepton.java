package JavaProgram;

import java.util.Scanner;

public class illegalStateExcepton  {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		scanner.close();    // we will get illegalStateExcepton if close before collecting the data;
		int num = scanner.nextInt();
		scanner.close();
		
		
		
		
		

	}

}

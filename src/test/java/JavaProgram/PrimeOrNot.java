package JavaProgram;

public class PrimeOrNot {

	public static void main(String[] args) {
		
		primNumber(26);
		

	}
	
	
	
	public static void primNumber(int num) {
		
		int count=0;
		if(num > 1) {
		
		for (int i=1 ; i<=num; i ++) {
			
			if(num%i==0)
				count++;
									
		}
		
		if (count ==2)
			System.out.println("Number is Prime number ");
		
		else 
			System.out.println("Number is not prime");
		
		}
		
		else
			System.out.println("Number is not prime");
	}

}

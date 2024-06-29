package JavaProgram;

public class SumOfDigit {

	public static void main(String[] args) {
		
		
		sumOfD(4444);

	}
	
	
	public static void sumOfD(int num) {
		
		int sum=0;
		int rem=0;
		
		while (num!=0) {
		rem = num%10;
		
		sum  = sum + rem ;
		
		num = num/10;
		
		
		}
		
		System.out.println(sum);
		
		
	}

}

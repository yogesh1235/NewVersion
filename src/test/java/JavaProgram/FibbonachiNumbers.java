package JavaProgram;

public class FibbonachiNumbers {

	public static void main(String[] args) {

		fibonacciSerices(10);
		
		
		
		
	}

	
	public static void fibonacciSerices(int num) {
		
		int n1=0, n2=1,  sum=0;
		
		
		
		System.out.print(n1 + " "+ n2);
		
		for(int i=2; i<num ; i ++) {
			
			// 0 1    1 2 3 5
			
			sum = n1 + n2;   // n1=1 n2 =2 sum =3
			
			n1=n2;      // n1=2  
			n2=sum;     // n2=3
			System.out.print(" " + sum);   // 2 
			
			
		}
		
		
		
	}
	
	
}

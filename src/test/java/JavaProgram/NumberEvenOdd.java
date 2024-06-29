package JavaProgram;

public class NumberEvenOdd {

	public static void main(String[] args) {

		
		numberEvenOdd(123564567);
		
	}
	
	
	public static void numberEvenOdd(int num) {
		
		int even_num =0;
		int odd_num=0;
		
		while (num!=0) {
		int rem = num%10;
		
		
		if (rem%2==0)
			even_num++;
		else 
			odd_num++;
		
		num= num/10;
	
		}
		
		System.out.println("Even Number  " + even_num + "   Odd Number  " + odd_num  );
	}

}

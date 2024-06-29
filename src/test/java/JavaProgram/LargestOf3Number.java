package JavaProgram;

public class LargestOf3Number {

	public static void main (String [] args) {
		
		int a=10 , b =50 , c =30 ;
		
		if ( a>b && a>c)
			System.out.println("a is greatest");
		else if (b>a && b>c)
			System.out.println("b is greatest");
		else 
			System.out.println("c is greatest");
		
		ternaryCheck();
		
	}
	
	public static void ternaryCheck() {
		
		int a=10 , b =50 , c =30 ;
		
		int largestAB = a>b?a:b;  //Largest of first two num 
		
		int LargestNext = largestAB>c?largestAB:c;      // int LargestNext = (a>b?a:b)>c?(a>b?a:b):c;
		
		System.out.println(LargestNext);
		
		
	}
	
	
	
	
	
}

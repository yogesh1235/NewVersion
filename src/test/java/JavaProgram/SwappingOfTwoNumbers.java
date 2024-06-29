package JavaProgram;

public class SwappingOfTwoNumbers {

	public static void main(String[] args) {
		
		int a= 5, b =10 ; 
		
		System.out.println("Before swapping  "  + a +"   "  +b);
				
		//Using 3rd varibale
		
		  int temp;
		  
		  temp =a; a=b; b=temp;
		 
		 
		///Without using third variable using + -
		
		a  = a+b ; // 5 + 10 = 15
		b = a-b ; // 15 - 10 = 5
		a = a-b ; // 15 -5  = 10
		
		System.out.println("After swapping   "  + a +"   "  +b);
		
		//Using * and  /  condition is a and b should not be 0 
		
		a = a*b   ; //5*10 = 50
		b = a/b   ; //50/10 = 5
		a = a/b  ;  // 50 /5 =10
		
		//single statement 
		
		b = a+b - (a=b);
		
		
	}

}

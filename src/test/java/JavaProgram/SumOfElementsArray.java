package JavaProgram;

public class SumOfElementsArray {

	public static void main(String[] args) {

		int a[] = {5, 6 , 7 , 2 , 6};
		
		int sum =0 ; 
		
		for(int i=0 ; i<=a.length-1; i ++ ) {
			
			sum = a[i]+ sum;
			
			
		}
		
		
		System.out.println(sum);
		
		
		foreach();
		
	}

	
	
	public static void foreach() {
		
		
		int a[] = {5, 6 , 7 , 2 , 6};
		int sum =0;
		
		
		for(int i : a) {
			
		sum=	i+sum;
			
		}
	System.out.println(sum);	
		
	}
	
	
	
}

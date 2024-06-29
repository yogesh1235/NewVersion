package JavaProgram;

public class EvenOddNumArray {

	public static void main(String[] args) {
		int a[] = {5, 6 , 7 , 2 , 6};


		for(int i=0 ; i<=a.length-1; i ++ ) {

			//Extracting even number
			if(a[i]%2==0) {
				
				System.out.println("Even Number    "+a[i]);
			}
			
			else 
				System.out.println("odd Number    " +a[i]);


		}
		
		enc();
		
	}
	
	
	//Enhanced loop
	
	public static void  enc() {
		
		int a[] = {5, 6 , 7 , 2 , 6};
		
		for(int val : a) {
			
			if(val%2==0) {
				
				System.out.println("Even Number    "+val);
			}
			
			else 
				System.out.println("odd Number    " +val);

			
		}
		
		
	}
	

}

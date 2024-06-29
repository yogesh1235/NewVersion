package JavaProgram;

public class LargestNumberInArray {
	
	
	public static void main(String[] args) {
		
	
	int[] arr = {10 , 20 , 5 , 18 , 25 , 19};
	
	
	int largestNum  = 
			largestNumber(arr);
	System.out.println(largestNum);
	
	}

	public static int largestNumber(int[] arr) {
		
		int max=0; 
	for(int i=0; i < arr.length ; i++) {
		
		
		if(arr[i]>max) {
			
			max = arr[i];
								
		}
		
		
	}
	return max;
		
		
	}
	
}

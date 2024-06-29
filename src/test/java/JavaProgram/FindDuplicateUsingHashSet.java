package JavaProgram;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateUsingHashSet {

	public static void main(String[] args) {
	
		
		int arr[] = { 1, 2, 5, 1, 7, 2, 4, 2 };
	       
        removeDuplicates(arr);
		
		

	}

	private static void removeDuplicates(int[] arr) {
		
		Set<Integer> set = new HashSet<Integer>();
		Set<Integer> duplicate = new HashSet<Integer>();
		
		for(int num : arr) {
		if(set.add(num));
		else 
			duplicate.add(num);
		
		
		
			
			
		}
		System.out.println(duplicate);
		
		
		
	}

}

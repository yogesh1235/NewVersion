package JavaProgram;

import java.util.HashMap;
import java.util.Map;

public class DuplicateNumberUsingHashMap {

	public static void main(String[] args) {

		
		int arr[] = {1,2,3,3,4,6,7,4 };
		
		
		HashMap<Integer, Integer> hm = new HashMap<Integer,Integer>();
		
		for (int a : arr ) {
			
			if(!hm.containsKey(a)) {
				
				hm.put(a, 1);
			
				}
			
			else 
			{
				hm.put(a, hm.get(a)+1);
			}
				
			
		}

		for(Map.Entry<Integer,Integer> entry : hm.entrySet()) {
			
			System.out.println("Key -- " + entry.getKey() + "  Values-- " + entry.getValue());
			
			
		}
		
		
	}

}

package JavaProgram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollections {

	public static void main(String[] args) {
		
		List<Integer> ls = new ArrayList<Integer>(); 
		
		ls.add(5);
		ls.add(10);
		ls.add(2); 
		ls.add(15); 
		ls.add(12);
		
		Collections.sort(ls);
		
		System.out.println(ls);
		
		
		
	}
}

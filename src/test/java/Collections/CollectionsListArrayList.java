package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;



public class CollectionsListArrayList {

	public static void main(String[] args) {

		//Syntax 
		
		ArrayList <String> al = new ArrayList<String>();
		
		ArrayList aa = new ArrayList(); // To store heterogeneous data 
		aa.add("x");
		aa.add("y");
		aa.add("z");
		System.out.println(aa);
		System.out.println(aa.size()); //to know the size
		aa.remove(1);
		aa.add(1, "Index");
		System.out.println(aa);
		
		
		
		//For loop 
		for (int i =0 ;  i <aa.size() ;i++) {
			
			System.out.println(aa.get(i));
			
		}
		
		
		//for each 
		
		for (Object o : aa) {
			
			System.out.println(o);
			
		}
		
		//iterator 
		
		Iterator it = aa.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
//	=======================================//
		//AddAll
		ArrayList ab = new ArrayList(); // To store heterogeneous data 
		ab.add("a");
		ab.add("b");
		ab.add("c");
		
		ab.addAll(aa);
		
		System.out.println(ab);
		
		
		Collections.sort(ab);  //For Sorting
		
		System.out.println(ab);

//		=======================================//
		// Array To ArrayLsit 
		
		String arr [] = {"ab" , "ba" , "xy" };
		
		ArrayList al1 = new ArrayList(Arrays.asList(arr));
		
		
		System.out.println(al1);
		
		
	}

}

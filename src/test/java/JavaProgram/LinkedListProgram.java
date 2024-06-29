package JavaProgram;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListProgram {
	

		
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		
		LinkedList  ll = new LinkedList();
		ll.add(22) ; 
		ll.add(21) ;
		ll.add(25) ;
		ll.add(22) ;
		ll.add(22) ;
		ll.add(69) ;
		
		/*
		 * System.out.println(ll); System.out.println(ll.size()); ll.remove("String");
		 * //We can mention index or object which need to be remove
		 * System.out.println(ll); //to get the object ll.get(2); // to add to the
		 * particular index ll.add(2 , "java"); // to set at particular index ll.set(2,
		 * "python") ;
		 */
		
		// Removing first item from list using removeFirst method
			//	ll.removeFirst();
				// Removing last item from list using removeLast method.
				ll.remove();  // Removes the first node
				System.out.println(ll);
				
				//Sorting using collections class 
				
				Collections.sort(ll);
				Collections.sort(ll,Collections.reverseOrder());
				
				System.out.println(ll);
				
				
		
		
	}

}

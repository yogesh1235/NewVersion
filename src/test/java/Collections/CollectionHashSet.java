package Collections;

import java.util.HashSet;
import java.util.LinkedList;

public class CollectionHashSet {
	
	public static void main(String[] args) {

		//When we don't want insertion order to be maintained we can use set and value should be unique 
		//
		
		
		
		// Syntax
		HashSet lk = new HashSet();
		lk.add(100);
		lk.add("Yogesh");
		lk.add(true);
		
		
		System.out.println(lk);
		System.out.println(lk.size());
		
	// Union   When we have two set list and we want only unique items + common item only for once. 
		
		HashSet hs = new HashSet();
		lk.add(101);
		lk.add("Yogesh");
		lk.add(true);
		
		
		
		lk.addAll(hs);
		
		System.out.println(lk);
		
	}

}

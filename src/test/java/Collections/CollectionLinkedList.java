package Collections;

import java.util.LinkedList;

public class CollectionLinkedList {

	public static void main(String[] args) {

		//When we want to insert and delete we should use linked list 
		// when we want frequently retrieving operations we should go with array list 
		
		//Methods 
		// addLast(obj) this will add at the end of the list addFirst() this will add to the first of the element 
		// removeFirst(obj) removeLast(obj) getFirst() getLast() 
		
		// Syntax
		LinkedList lk = new LinkedList();
		lk.add(100);
		lk.add("Yogesh");
		lk.add(true);
		
		System.out.println(lk);
		System.out.println(lk.size());
		
		//Insert in the middle of the index
	//	lk.remove(1);
		lk.add(1, "Java");
		lk.set(1, "set");
		
		System.out.println(lk);
		
		
	}

}

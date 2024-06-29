package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class diffBetweenComprableComprator implements Comparator {

	
	//comparable is meant of default natural sorting and comparator meant for customize sorting
	//Comparable present in java.lang package comparator in java.util
	//comparable have compareTo() method and comparator compare() and equal()
	
	//whenever we are implementing comparator interface we need to provide implementation only to compare method as comparator is child class of object class and
	// it already have equal method 
	
	public static void main(String[] args) {
		
	
	List<Integer> myNumbers  =  new ArrayList<Integer>();
	
	myNumbers.add(33);
    myNumbers.add(15);
    myNumbers.add(20);
    myNumbers.add(34);
    myNumbers.add(8);
    myNumbers.add(12);
    Collections.sort(myNumbers);  // Ascending  order sorting 
    Collections.sort(myNumbers , Collections.reverseOrder());
    
   for(Integer num : myNumbers) {
	   
	   System.out.println(num);
   }
    
	
	}

	
	public int compare(Object o1, Object o2) {
		Integer I1 = (Integer) o1 ; 
		Integer I2 = (Integer) o2 ;
		return I1.compareTo(I2); 
	}

	
	
	
	
	
}

package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CollectionMap {

	
	//In Map duplicate key is not allowed but value is 
	// 1 key and value pair together is called Entry 
	
	
	//map is an interface and implimented by HashMap Class 
	//underlying ds is HashTable 
	//insertion order is not preserved
	//null key is allowed only once but as value it is allowed multiple 
	
	//Methods 
	// m.put(key,value)  , m.putAll(map m1) , m.get(key) , m.remove(key) , m.comtainsKey(key) , m.containsValue(value) , m.isEmpty() -- > True or false , m.clear() , m.size()
	// m.keySet () this will return all keys return type will be SET // m.values() all values will return  and return type will be COLLECTION
	//m.entrySet() this will return all entry set // m.setvalue(key.value)
	public static void main (String[] args) {
	HashMap<Integer,String> hm = new HashMap<Integer,String>();
	Object obj = hm.put(1 , "Saatvik"); // the return type of this will be null as there is no value has been replaced 
	hm.put(2 , "Sonia");
	hm.put(3 , "Shivaay");
	hm.put(4 , "Yogesh");
	
		
	//Entry Methods 
	
	for (Map.Entry<Integer, String> entry:hm.entrySet()) {
		
		System.out.println(entry.getKey() + "       " + entry.getValue());
	}
	System.out.println();
	
	//Iterator 
	Set s = hm.entrySet();
	Iterator itr = 	s.iterator();

	while(itr.hasNext()) {
		
		Map.Entry<Integer, String> entry =  (Entry<Integer, String>) itr.next();
	
		System.out.println(entry.getKey() + "       " + entry.getValue());
		
	}
	
	
	
	
	}
}

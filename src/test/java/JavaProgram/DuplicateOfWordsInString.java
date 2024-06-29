package JavaProgram;

import java.util.HashMap;
import java.util.Map;

public class DuplicateOfWordsInString {

	public static void main(String[] args) {
		
		String str = "I am learning learning java java programming" ; 
		
		numberOfWords(str);
		
		
	}
	
	
	public static void numberOfWords(String str) {
		
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		
		String[] string = str.split(" ") ; 
		
		for (String word : string) {
			
	
		if(!hm.containsKey(word)) {
			hm.put(word , 1); 
			
		}
		
		else 
			hm.put(word, hm.get(word)+1);
		
		}	
		
for(Map.Entry<String,Integer> entry : hm.entrySet()) {
			
	if (entry.getValue()>1)
			System.out.println( entry.getKey() + "    " + entry.getValue());
			
			
		}
		
		
	}

}

package JavaProgram;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedCharacter {

	public static void main(String[] args) {

		String str = "yogesh aggarwal" ; 
		firstCharNonRepeated(str);

	}


	public static void firstCharNonRepeated(String str) {


		HashMap<Character , Integer> hm = new LinkedHashMap<Character, Integer>();
		
		int count =1;
		
		for(int i =0; i<str.length(); i ++) {
			
			if(!hm.containsKey(str.charAt(i)))
				
				hm.put(str.charAt(i), count);   
			else 
				hm.put(str.charAt(i), count+1);
		}

			for(Map.Entry<Character , Integer> entry : hm.entrySet() ) {
				
				if (entry.getValue()==1) {
				System.out.println("First non repeated char-----" + entry.getKey());
				break;
				}
				
			}


	}

}
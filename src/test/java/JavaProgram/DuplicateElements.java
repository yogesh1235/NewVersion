package JavaProgram;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DuplicateElements{

public static List<Integer> duplciateElements(int[] num){
Map<Integer, Integer >  map  = new HashMap<Integer, Integer>(); 
List<Integer> list = new ArrayList<Integer>();

for(int flag : num)
map.put(flag, map.getOrDefault(flag,0)+1);


for(Map.Entry<Integer,Integer> entry : map.entrySet()){
if (entry.getValue()>1)
list.add(entry.getKey());

}

return  list; 

}


public static void main(String[] args){

         int[] arr = {1, 6, 3, 1, 3, 6, 6}; 
		 
	List<Integer> ls =  duplciateElements(arr);
		
		if(ls.isEmpty())
		System.out.println("No Duplicate Elements ");
		
		else {
            System.out.println("The repeating elements are:");
            for (int num : ls) {
                System.out.print(num + " ");
            }


} 
}

}
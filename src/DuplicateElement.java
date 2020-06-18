import java.util.*;
import java.util.HashMap;
import java.util.Map.Entry;

public class DuplicateElement {

	public static void main(String[] args) {
		int inputarray[] = {1,2,3,4,4,5};
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int element : inputarray)
		{
			if(map.get(element) == null)
			{
				map.put(element, 1);
			}
			else
			{
				map.put(element, map.get(element)+1);
			}
		}
		
	Set<Entry<Integer, Integer>> entrySet = map.entrySet();
        
	    for (Entry<Integer, Integer> entry : entrySet) 
	    {               
	        if(entry.getValue() > 1)
	        {
	            System.out.println("Duplicate Element : "+entry.getKey()+" - found "+entry.getValue()+" times.");
	        }
	    }
		
	}
	
}

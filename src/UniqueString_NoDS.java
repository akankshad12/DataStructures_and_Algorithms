import java.util.*;

public class UniqueString_NoDS {
	public static void main(String[] args)
	{
		String str = "akshua";
		boolean[] char_set = new boolean[256];
		
		boolean result = true;
		for(int i = 0; i < str.length(); i++)
		{
			int val = str.charAt(i);
			if(char_set[val])
				result = false;
			char_set[val] = true;
		}
		
		System.out.println(result);
	 }
}

/*

import java.util.*; 
  
class UniqueString_NoDS { 
    boolean uniqueCharacters(String str) 
    { 
        // If at any time we encounter 2 same 
        // characters, return false 
        for (int i = 0; i < str.length(); i++) 
            for (int j = i + 1; j < str.length(); j++) 
                if (str.charAt(i) == str.charAt(j)) 
                    return false; 
  
        // If no duplicate characters encountered, 
        // return true 
        return true; 
    } 
  
    public static void main(String args[]) 
    { 
        UniqueString_NoDS obj = new UniqueString_NoDS(); 
        String input = "aba"; 
  
        if (obj.uniqueCharacters(input)) 
            System.out.println("The String " + input + " has all unique characters"); 
        else
            System.out.println("The String " + input + " has duplicate characters"); 
    } 
} 
*/
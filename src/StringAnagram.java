import java.util.Arrays;
import java.util.*;


public class StringAnagram {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		
		Scanner sc1 = new Scanner(System.in);
		String str2 = sc1.nextLine();
		String str3 = str1.replaceAll(" ", "%20");
		str1 = str1.replaceAll("\\s", "");
		str2 = str2.replaceAll("\\s", "");
		System.out.println(str3);
		
		/*boolean status = true;
		if(str1.length() != str2.length())
		{
			status = false;
		}
		else
		{
			char[] ArrayS1 = str1.toLowerCase().toCharArray();
			char[] ArrayS2 = str2.toLowerCase().toCharArray();
			
			Arrays.sort(ArrayS1);
			Arrays.sort(ArrayS2);
			
			status = Arrays.equals(ArrayS1, ArrayS2);
			if(status)
			{
				System.out.println(str1 + " and " + str2 + " are anagrams");
			}
			else
			{
				System.out.println(str1 + " and " + str2 + " are not anagrams");
			}
			
		}

				
	}*/
		boolean result = false;
		
		HashMap<Character, Integer> map = new HashMap<>();
		for(int i = 0; i < str1.length(); i++)
		{
			if(!map.containsKey(str1.charAt(i))) {
				map.put(str1.charAt(i), map.getOrDefault(str1.charAt(i), 0) + 1);
				
			}
		}
		
		for(int j = 0; j < str2.length(); j++)
		{
			if(!map.containsKey(str2.charAt(j)))
			{
				result = true;
			}
			
		}
		
		if(result == false)
		{
			System.out.println("Anagrams");
		}
		else
		{
			System.out.println("Not anagrams");
		}
		
		
}
}

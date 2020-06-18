import java.util.*;

public class ReverseString {
	public static void main(String[] args)
	{
		//HashSet<String> hs = new HashSet<String>();
		//hs.add("Hello");
		
		String str = "Hello";
		String str1 = "";
		for(int i = str.length()-1; i>=0; i--)
		{
				str1 = str1 + str.charAt(i);
			
		}
		System.out.println(str1);
	}

}

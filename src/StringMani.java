
import java.util.Scanner;
public class StringMani{

	public boolean stringunique(String str)
	{
		for(int i = 0; i < str.length(); i++)
        {
         for(int j = i+1; j < str.length(); j++)
            {
                if( str.charAt(i) == str.charAt(j))
                	return false;
            }
        }
		return true;
	}
	
     public static void main(String []args){
        System.out.println("Enter the string: ");
        Scanner sc = new Scanner(System.in);
        String  str = sc.nextLine();
        System.out.println("The string is: " + str);
        StringMani Str1 = new StringMani();
        if(Str1.stringunique(str))
        	System.out.println("unique string");
        else 
        	System.out.println("Not unique");

     }
}
import java.util.*;

public class SumPair {

	public static void main(String[] args)
	{
		int arr[] = {2,6,3,9,1,4};
		int sum = 5;
		for(int i =0 ; i<=5; i++)
		{
			for(int j = i; j<=5; j++)
			{
				if(arr[i] + arr[j] == sum)
				{
					System.out.println(arr[i] + " and " + arr[j]);
				}
				
			}
		}
	}
}

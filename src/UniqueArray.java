import java.util.*;

public class UniqueArray {

	public static void main(String[] args) {

		int arr[] = {1,2,2,3};
		int sum = 0;
		
		HashSet<Integer> hs = new HashSet<>();
		
		for(int i = 0; i < arr.length;i++)
		{
			if(!hs.contains(arr[i]))
			{
				sum += arr[i];
			}
			hs.add(arr[i]);
		}
		System.out.println(sum);
	}
		
}

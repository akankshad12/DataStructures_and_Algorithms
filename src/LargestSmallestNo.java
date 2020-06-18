import java.util.*;

public class LargestSmallestNo {
public static void main(String[] args) {
	int inputarray[] = {3,2,1,5,8};
	int largest = inputarray[0];
	int smallest = inputarray[0];
	
	for(int i = 0; i<=4; i++)
	{
		if(inputarray[i] > largest)
		{
			largest = inputarray[i];
		}
		else
		{
			if(inputarray[i] < smallest)
			{
				smallest = inputarray[i];
			}
		}
	}
	System.out.println(largest);
	System.out.println(smallest);
	
}
}

import java.util.Arrays;
import java.util.Scanner;

public class Bubblesort {
	
	public void bubble(int arr[]) {
		
		int n = arr.length;
		for(int i = 0; i < n-1; i++)
		{
			for(int j =0; j < n-2; j++) {
	
				if(arr[j] > arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
	
			}
		}
	System.out.println(Arrays.toString(arr));
	}
	
public static void main(String args[]) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the length of array: ");
	int length = sc.nextInt();
	
	int[] myArray = new int[length];
	System.out.println("Enter the elements of an array:");
	
	for(int i =0; i < length; i++) {
		myArray[i] = sc.nextInt();
	}
	System.out.println(Arrays.toString(myArray));
	Bubblesort b = new Bubblesort();
	
	b.bubble(myArray);
		
}
	
	
	
}

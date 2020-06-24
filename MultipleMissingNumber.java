//Unsorted Multiple missing numbers with duplicates

public class MultipleMissingNumber {
	// let's create another array with same length // by default all index will contain zero // default value for int variable 
		
	public static void main(String[] args)
	{
		int[] input = {0,9,9,7,7,1,1};
		int max = 0;
		
		for(int i = 0; i < input.length; i++)
		{
			max = Math.max(max,input[i]);
		}
		
		int[] register = new int[max + 1]; 
			
		
			// now let's iterate over given array to // mark all present numbers in our register // array 
			
			for (int i : input) 
			{ 
				register[i] = 1; 
				//System.out.println(register[i]);
			
			} 
			// now, let's print all the absentees 
			
			//for(int i = 0; i < register.length; i++)
			//{
			//	System.out.println(register[i]);
			//}
			
				System.out.println("missing numbers in given array"); 
			
			for (int i = 1; i < register.length; i++)
			{ 
				if (register[i] == 0) 
				{ 
					System.out.println(i); 
			    } 
		    }
}
}

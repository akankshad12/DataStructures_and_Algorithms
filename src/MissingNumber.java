import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
//Missing number - One unsorted without duplicates

public class MissingNumber {
	
	 static HashSet<Integer> set = new HashSet<>();
	 
	 public static List<Integer> result(int[] res)
	 {
		List<Integer> ls = new ArrayList<>();
		
			for(int i : res)
			{
				set.add(i);
			}
			
			int count = res.length + 1; 
			for(int i = 0; i < count; i++)
			{
				if(!set.contains(i))
				{
					ls.add(i);
				}
				//System.out.println(res[i]);
			}
			
			return ls;

	 }

		public static void main(String[] args) { 
				
			int[] input = {3,0,1}; 
			MissingNumber ms = new MissingNumber();
			
			List<Integer> result1 = MissingNumber.result(input);
			System.out.println(result1);
			
		}
}
	


		



	

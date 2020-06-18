import java.util.Arrays;
import java.util.HashSet;
import java.util.Stack;

public class Reversearray {

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<Integer>();
        int[] arr= {1,2,3,4,5,7};
        
System.out.println(Arrays.toString(arr));
        for (int i=0;i<arr.length;i++) {
           
            st.push(arr[i]);
        }
        int[] array2 = new int[6];
        for(int j =0 ;j< array2.length; j++)
        {
        	array2[j] =  st.pop(); 
             
        }
       
       System.out.println(Arrays.toString(array2));
      
}
}
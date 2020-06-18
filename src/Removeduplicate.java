import java.util.HashSet;
import java.util.Stack;

public class Removeduplicate {

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<Integer>();
        int[] arr= {1,2,3,3,4,5,5,7};
        HashSet<Integer> set = new HashSet<Integer>();

        for (int i=0;i<arr.length;i++) {
            if(set.add(arr[i]) == true)
            st.push(arr[i]);
        }
        System.out.println(st); 

    }   
}
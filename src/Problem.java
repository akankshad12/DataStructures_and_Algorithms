import java.util.ArrayList;
import java.util.List;

public class Problem {
	
	public static void main(String[] args) {
		String s1 = "today is sunny and okay I feel yes so happy",
			   s2 = "tomorrow is sunny and that makes today is sunny and okay me feel yes so happy too";
		System.out.println(solve(s1, s2));
	}

	public static List<String> solve(String s1, String s2) {
		List<String> res = new ArrayList<>();
		String[] arr1 = s1.split(" "), arr2 = s2.split(" ");
		int[][] dp = new int[arr1.length+1][arr2.length+1];
		for(int i=1;i<=arr1.length;i++) {
			for(int j=1;j<=arr2.length;j++) {
				if(arr1[i-1].equals(arr2[j-1])) {
					dp[i][j] = dp[i-1][j-1] + 1;
				}else {
					dp[i][j] = 0;
				}
			}
		}
		for(int i=dp.length - 1;i>=0;i--) {
			for(int j=dp[0].length-1;j>=0;j--) {
				StringBuilder sb = new StringBuilder();
				if(dp[i][j] >= 3) {
					int ci = i, cj = j;
					while(dp[ci][cj] > 0) {
						dp[ci][cj] = 0;
						sb.insert(0, arr1[ci-1] + " ");
						ci--;cj--;
					}
					sb.deleteCharAt(sb.length() - 1);
					res.add(sb.toString());
				}
			}
		}
		return res;
	}
}
//Input: a = "today is sunny and okay I feel yes so happy", b = "tomorrow is sunny and that makes today is sunny and okay me feel yes so happy too"
//Output: ["is sunny and", "feel yes so happy", "today is sunny and okay"]
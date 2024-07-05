import java.io.*;
import java.util.*;

public class Main {
	//dp[1] = 1		dp[2] = 1	dp[3] = 1	dp[4] = 2	dp[5] = 3	dp[6] = 2

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] dp = new int[N+1];
		for(int i=2; i<=N; i++){
			dp[i] = dp[i-1] + 1; // case 3 : 1을 빼는 경우, case 2, 3 전부 나누어 떨어질 때를 가정하기 때문에 감산이 우선적으로 이뤄져야 함.
			if(i % 2 == 0) {
				dp[i] = Math.min(dp[i], dp[i/2]+1); // case 2 : 2로 나누어 떨어질 때 2로 나누는 연산.
			}
			if(i % 3 == 0) {
				dp[i] = Math.min(dp[i], dp[i/3]+1); // case 3 : 3으로 나누어 떨어질 때 3으로 나누는 연산.
			}
		}
		System.out.println(dp[N]);
	}
}
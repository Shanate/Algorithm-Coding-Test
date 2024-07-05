
import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		int n = Integer.parseInt(br.readLine());
		int[] w = new int[n+1];
		int[] v = new int[n+1];
		st = new StringTokenizer(br.readLine());
		for(int i=1; i<=n; i++) {
			w[i] = Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(br.readLine());
		for(int i=1; i<=n; i++) {
			v[i] = Integer.parseInt(st.nextToken());
		}
		int k = 99;
		int[][] dp = new int[n+1][100];
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=k; j++) {
				if(w[i]<=j) {
					dp[i][j] = Math.max(dp[i-1][j], v[i]+dp[i-1][j-w[i]]);
				} else {
					dp[i][j] = dp[i-1][j];
				}
			}
		}
		System.out.println(dp[n][k]);
	}
}
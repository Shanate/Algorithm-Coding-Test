import java.io.*;
import java.util.*;

public class Main {

    static long[] dp = new long[101];

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 1;
        dp[3] = 1;

        for (int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine());
            System.out.println(P(n));
            }
        }
        static long P(int n) {
        if(dp[n] == 0) {
            dp[n] = P(n - 2) + P(n - 3);
        }
        return dp[n];
    }
}

import java.io.*;
import java.util.*;

/*
1 -> 1
2 -> 2
3 -> 3
4 -> 5
5 -> 8
6 -> 13 : 피보나치 수 => N = N-1 + N+2
*/

public class Main {

    static int[] dp = new int[1000001];

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i < dp.length; i++) {
            dp[i] = 0;
        }
        int answer = Tile(n);
        System.out.println(answer);

    }

    static int Tile(int n) {
        if(dp[n] == 0){
            dp[n] = (Tile(n-1) + dp[n-2]) % 15746;
        }
        return dp[n];
    }
}

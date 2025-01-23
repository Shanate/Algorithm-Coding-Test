import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] V = new int[N];
        boolean[][] dp = new boolean[N + 1][M + 1];

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            V[i] = Integer.parseInt(st.nextToken());
        }

        dp[0][S] = true;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j <= M; j++) {
                if (dp[i][j]) {
                    if (j + V[i] <= M) {
                        dp[i + 1][j + V[i]] = true;
                    }
                    if (j - V[i] >= 0) {
                        dp[i + 1][j - V[i]] = true;
                    }
                }
            }
        }

        // 마지막 곡에서 가능한 최대 볼륨 찾기
        int result = -1;
        for (int i = 0; i <= M; i++) {
            if (dp[N][i]) {
                result = i;
            }
        }

        System.out.println(result);
    }
}

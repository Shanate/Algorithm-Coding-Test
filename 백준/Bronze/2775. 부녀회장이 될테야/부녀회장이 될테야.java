import java.io.*;
import java.util.*;

/*
K층의 N호에는 (K-1)층의 N호 + K층의 (N-1)호의 사람이 들어와야 한다.
 */

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            int k = Integer.parseInt(br.readLine()); // 층
            int n = Integer.parseInt(br.readLine()); // 호수

            // 아파트 배열 초기화 (0층부터 k층, 1호부터 n호)
            int[][] apt = new int[k + 1][n + 1];

            for (int i = 1; i <= n; i++) {
                apt[0][i] = i; // 0층에는 1호부터 i명의 사람이 살고 있다.
            }

            for (int i = 1; i <= k; i++) { // 1층부터 k층까지
                for (int j = 1; j <= n; j++) { // 1호부터 n호까지
                    apt[i][j] = apt[i - 1][j] + apt[i][j - 1];
                }
            }

            // 결과 출력
            System.out.println(apt[k][n]);
        }
    }
}
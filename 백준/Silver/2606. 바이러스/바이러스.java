import java.io.*;
import java.util.*;

public class Main {

    static int N, M;
    static int[][] G;
    static boolean[] visited;
    static int cnt;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());
        G = new int[N][N];
        visited = new boolean[N];
        cnt = 0;

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int from = Integer.parseInt(st.nextToken()) - 1; // 시정점
            int to = Integer.parseInt(st.nextToken()) - 1; // 종정점
            G[from][to] = 1;
            G[to][from] = 1;
        }

        dfs(0);
        System.out.println(cnt-1);

    }

    private static void dfs(int i) {
        visited[i] = true;
        cnt++;
        for (int j = 0; j < N; j++) {
            if(G[i][j] != 0 && !visited[j]) {
                dfs(j);
            }
        }
    }
}

import java.io.*;
import java.util.*;

public class Main {
        static int n, m;
        static int[][] family;
        static boolean[] visited;
        static int ans = -1;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        family = new int[n + 1][n + 1];
        visited = new boolean[n + 1];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int relX = Integer.parseInt(st.nextToken());
        int relY = Integer.parseInt(st.nextToken());

        m = Integer.parseInt(br.readLine());

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            family[x][y] = 1;
            family[y][x] = 1; // 양방향 처리
        }
        dfs(relX, relY, 0);

        System.out.println(ans);

    }

    static void dfs(int relX, int relY, int cnt) {
        // 종료조건
        if (relX == relY) {
            ans = cnt;
            return;
        }

        visited[relX] = true;
        for (int i = 1; i <= n; i++) {
            if (family[relX][i] == 1 && !visited[i]) {
                dfs(i, relY, cnt + 1);
            }
        }
    }
}

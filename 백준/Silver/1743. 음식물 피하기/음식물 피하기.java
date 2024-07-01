import java.io.*;
import java.util.*;

public class Main {
    static int N,M,K;
    static int[][] g;
    static boolean[][] v;
    static int Max;
    static int cnt;

    static int[] di = {-1, 0, 1, 0};
    static int[] dj = {0, 1, 0, -1};

    static void dfs(int i, int j) {
        v[i][j] = true;
        cnt++;

        for (int d = 0; d < 4; d++) {
            int ni = i + di[d];
            int nj = j + dj[d];

            if (ni >= 0 && ni < N && nj >= 0 && nj < M && g[ni][nj] != 0 && !v[ni][nj]) {
                dfs(ni, nj);
            }
        }
    }
        public static void main(String[] args) throws Exception {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());
            g = new int[N][M];
            v = new boolean[N][M];
            cnt = 0;
            Max = 0;

            for(int i=0; i<K; i++) {
                st = new StringTokenizer(br.readLine()," ");
                int r = Integer.parseInt(st.nextToken()) - 1; // 시정점
                int c = Integer.parseInt(st.nextToken()) - 1; // 종정점
                g[r][c]=1;
            }

            for(int i=0; i<N; i++){
                for(int j=0; j<M;j++){
                    if(g[i][j] != 0 && !v[i][j]){
                        cnt = 0;
                        dfs(i,j);
                        Max = Math.max(Max, cnt);
                    }
                }
            }
            System.out.println(Max);
        }
}
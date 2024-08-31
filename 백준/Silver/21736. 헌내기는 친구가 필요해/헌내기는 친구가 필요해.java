import java.io.*;
import java.util.*;

public class Main {

    static int[] di = {-1, 0, 1, 0}; // 상 우 하 좌
    static int[] dj = {0, 1, 0, -1};
    static char[][] map;
    static boolean[][] v;
    static int dx;
    static int dy;
    static int n, m;
    static int cnt;


    private static void dfs(int i, int j) {
        v[i][j] = true;

        if(map[i][j] == 'P') {
            cnt++;
        }

        for(int d = 0; d < 4; d++) {
            int ni = i + di[d];
            int nj = j + dj[d];
            if(ni >= 0 && ni < n && nj >= 0 && nj < m && !v[ni][nj] && map[ni][nj] != 'X') {
                dfs(ni, nj);
            }
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            n = Integer.parseInt(st.nextToken()); // 행
            m = Integer.parseInt(st.nextToken()); // 열
            cnt = 0;
            map = new char[n][m];
            v = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            for (int j = 0; j < m; j++) {
                map[i][j] = str.charAt(j); // 지도 입력

                if(map[i][j] == 'I'){ // 위치 파악
                    dx = i;
                    dy = j;
                }
            }
        }
        dfs(dx, dy);

        if(cnt == 0){
            System.out.println("TT");
        }
        else{
            System.out.println(cnt);
        }
    }
}
import java.util.*;
import java.io.*;

public class Main{

    static int N;
    static int[][] map;
    static boolean[][] visited;
    static int cnt; // 카운트
    static int[] di = {-1, 0, 1, 0};
    static int[] dj = {0, -1, 0, 1};

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        map = new int[N][N];
        visited = new boolean[N][N];
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            for (int j = 0; j < N; j++) {
                map[i][j] = s.charAt(j) - '0';
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (map[i][j] == 1 && !visited[i][j]) {
                    cnt = 0;
                    dfs(i, j);
                    list.add(cnt);
                }
            }
        }
        Collections.sort(list);
        System.out.println(list.size());
        for (int num : list) {
            System.out.println(num);
    }
        }

    static void dfs(int x, int y) {
        visited[x][y] = true;
        cnt++;

        for(int k = 0; k < 4; k++) {
            int nx = x + di[k];
            int ny = y + dj[k];

            if (nx >= 0 && nx < N && ny >= 0 && ny < N && !visited[nx][ny] && map[nx][ny] == 1) {
                dfs(nx, ny);
            }
        }
    }
}

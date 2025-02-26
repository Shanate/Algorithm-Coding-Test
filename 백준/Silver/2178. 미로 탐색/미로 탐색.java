import java.io.*;
import java.util.*;

public class Main {

    static int N, M;
    static int[][] map;
    static boolean[][] visited;
    static int[] di = {1, -1, 0, 0}; // 상하좌우
    static int[] dj = {0, 0, 1, -1};

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N][M];
        visited = new boolean[N][M];
        for (int i = 0; i < N; i++) {
                String s = br.readLine();
            for (int j = 0; j < M; j++) {
                map[i][j] = s.charAt(j) - '0';
            }
        }

        bfs(0, 0); // 시작점
        System.out.println(map[N-1][M-1]);
//        System.out.println(Arrays.deepToString(map));
    }

    static void bfs(int x, int y) {
        ArrayDeque<int[]> queue = new ArrayDeque<>();
        queue.add(new int[]{x, y});
        visited[x][y] = true;

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int curX = cur[0];
            int curY = cur[1];

            for (int k = 0; k < 4; k++) {
                int nx = curX + di[k]; // 사방 탐색 시작
                int ny = curY + dj[k];

    if (nx >= 0 && nx < N && ny >= 0 && ny < M && visited[nx][ny] == false && map[nx][ny] == 1) {
                    visited[nx][ny] = true;
                    queue.add(new int[]{nx, ny});
                    map[nx][ny] = map[curX][curY] + 1;
                }


            }
        }
    }
}

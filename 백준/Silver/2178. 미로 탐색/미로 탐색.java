import java.io.*;
import java.util.*;

public class Main {

    static int N, M;
    static boolean[][] visited;
    static int[] di = {-1, 0, 1, 0};
    static int[] dj = {0, 1, 0, -1};
    static int[][] map;
    static int[][] distance;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        map = new int[N][M];
        visited = new boolean[N][M];
        distance = new int[N][M];

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < M; j++) {
                map[i][j] = str.charAt(j) - '0';
            }
        }

        bfs(0, 0);
        
        System.out.println(distance[N - 1][M - 1]);

    }

    static void bfs(int i, int j) {
        ArrayDeque<int[]> queue = new ArrayDeque<>();
        queue.add(new int[]{i, j});
        visited[i][j] = true;
        distance[i][j] = 1;

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int curX = cur[0];
            int curY = cur[1];

            for (int k = 0; k < 4; k++) {
                int nextX = curX + di[k]; // 다음 X좌표
                int nextY = curY + dj[k]; // 다음 Y좌표

                // 미로 범위 내인가? 그렇다면 길이 있는가? 방문해본 적이 있는가?
                if (nextX >= 0 && nextX < N && nextY >= 0 && nextY < M && map[nextX][nextY] == 1 && !visited[nextX][nextY]) {
                    queue.offer(new int[]{nextX, nextY}); // 큐에 다음 위치를 추가
                    visited[nextX][nextY] = true; // 방문 처리
                    distance[nextX][nextY] = distance[curX][curY] + 1; // 이전 위치 거리 + 1

                } // if
            } // for
        } // while
    } // bfs
} // Class

import java.io.*;
import java.util.*;
public class Main {
    static int[] di = {-1,0,1,0}; // 상우하좌(시계방향)
    static int[] dj = {0,1,0,-1};
    static int[][] map;
    static boolean[][] visited;
    static int[][] distance;
    static int N, M;

    static void bfs(int i, int j) {
        ArrayDeque<int[]> q = new ArrayDeque<>();
        q.offer(new int[]{i, j});
        visited[i][j] = true;
        distance[i][j] = 1;

        while (!q.isEmpty()) {
            int[] current = q.poll();
            int curX = current[0];
            int curY = current[1];

            for (int n = 0; n < 4; n++) {
                int nextX = curX + di[n];
                int nextY = curY + dj[n];

                if (nextX >= 1 && nextX <= N && nextY >= 1 && nextY <= M && map[nextX][nextY] == 1 && !visited[nextX][nextY]) {
                    q.offer(new int[]{nextX, nextY});
                    visited[nextX][nextY] = true;
                    distance[nextX][nextY] = distance[curX][curY] + 1;
                }
            }
        }
    }
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N+1][M+1]; // (1,1)부터 사용할 것
        distance = new int[N+1][M+1]; // 선택한 좌표까지 거리 더하기 위한 매트릭스. 사실상 카운트
        visited = new boolean[N+1][M+1]; // 방문처리
        for(int i=1; i<=N; i++){
            String str = br.readLine();
            for(int j=1; j<=M; j++){
                map[i][j] = str.charAt(j-1)-'0';
            }
        }
    bfs(1, 1); //(1,1)에서 시작
                System.out.println(distance[N][M]);
    }
}

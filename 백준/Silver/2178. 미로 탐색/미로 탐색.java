import java.io.*;
import java.util.*;

public class Main {

    static int N, M; // 맵 크기
    static boolean[][] visited;
    static int[] di = {-1, 0, 1, 0};    // 상, 우, 하, 좌 (4방 탐색)
    static int[] dj = { 0, 1, 0, -1};
    static int[][] map;
    static int[][] distance; // 각 위치까지의 최단 거리를 저장하는 2차원 배열

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        map = new int[N][M];
        visited = new boolean[N][M];
        distance = new int[N][M]; // 선택한 좌표까지 거리를 더하기 위한 매트릭스. == 카운팅

        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            for (int j = 0; j < M; j++) {
                map[i][j] = s.charAt(j) - '0';
            }
        }
        bfs(0,0);
        System.out.println(distance[N-1][M-1]);

    } // Main

    static void bfs(int i, int j) {
        ArrayDeque<int[]> q = new ArrayDeque<>(); // 'q' 어레이덱에 int[] 형식을 저장
        q.add(new int[]{i, j}); // i행과 j열을 어레이덱에 추가 // 시작 좌표 (0,0)을 큐에 추가
        visited[i][j] = true; // 시작 지점을 방문 처리
        distance[i][j] = 1; // 시작 지점에서의 거리를 초기화 (시작점도 카운팅한다 하였으니 '1'로 결정)

        while(!q.isEmpty()) {
            int[] cur = q.poll(); // 큐에서 현재 위치를 꺼낸다.
            int curX = cur[0]; // 현재 X좌표
            int curY = cur[1]; // 현재 Y좌표

            for (int k = 0; k < 4; k++) {
                int nextX = curX + di[k]; // 다음 X좌표
                int nextY = curY + dj[k]; // 다음 Y좌표

                // 미로 범위 내인가? 그렇다면 길이 있는가? 방문해본 적이 있는가?
                if (nextX >= 0 && nextX < N && nextY >= 0 && nextY < M && map[nextX][nextY] == 1 && !visited[nextX][nextY]) {
                    q.offer(new int[]{nextX, nextY}); // 큐에 다음 위치를 추가
                    visited[nextX][nextY] = true; // 방문 처리
                    distance[nextX][nextY] = distance[curX][curY] + 1; // 이전 위치 거리 + 1

                } // if
            } // for
        } // while
    } // bfs
} // Class

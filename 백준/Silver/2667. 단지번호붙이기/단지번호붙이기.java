import java.util.*;
import java.io.*;

public class Main {

    static int[][] map;
    static boolean[][] visited;
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    static int N;
    static int cnt;  // 단지 내 아파트 수를 세기 위한 변수

    // DFS로 아파트 단지 탐색
    static void dfs(int x, int y) {
        visited[x][y] = true;
        cnt++;  // 아파트 단지 내의 집 카운트 증가

        for (int k = 0; k < 4; k++) {
            int nx = x + dx[k];
            int ny = y + dy[k];

            // 지도를 벗어나지 않으면서, 방문하지 않았고 아파트가 있는 곳일 경우
            if (nx >= 0 && ny >= 0 && nx < N && ny < N) {
                if (map[nx][ny] == 1 && !visited[nx][ny]) {
                    dfs(nx, ny);
                }
            }
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        map = new int[N][N];
        visited = new boolean[N][N];

        ArrayList<Integer> list = new ArrayList<>();

        // 지도 입력 받기
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < N; j++) {
                map[i][j] = str.charAt(j) - '0';
            }
        }

        // 단지 번호 붙이기
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (map[i][j] == 1 && !visited[i][j]) {
                    cnt = 0;  // 새로운 단지 시작
                    dfs(i, j);
                    list.add(cnt);  // 단지 내 집 수를 리스트에 추가
                }
            }
        }

        // 결과 출력
        Collections.sort(list);  // 오름차순 정렬
        System.out.println(list.size());  // 총 단지 수 출력
        for (int num : list) {
            System.out.println(num);  // 각 단지 내 집 수 출력
        }
    }
}

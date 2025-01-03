import java.io.*;
import java.util.*;

public class Main {

    static int n;
    static int[][] map;
    static boolean[][] visited;
    static int[] di = {0,1,0,-1};
    static int[] dj = {-1,0,1,0};

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        n = Integer.parseInt(br.readLine());
        map = new int[n][n];
        int maxHeight = 0; // 지역 내 가장 높은 높이

        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<n; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
                if(map[i][j] > maxHeight){
                    maxHeight = map[i][j]; // 맵에 수위를 기록하면서 최대 높이 기록
                }
            }
        }
        int max =0; // 안전 영역의 최대 개수
        // 비 높이(height)를 0부터 최대 높이까지 증가시키며 안전 영역 탐색
        for(int height=0; height<maxHeight+1; height++) {
            visited = new boolean[n][n]; // 매번 새로운 탐색을 위해 초기화
            int cnt = 0;   // 현재 높이에서의 안전 영역 개수
            for (int i = 0; i < n; i++) {

                for (int j = 0; j < n; j++) {
                    // 해당 위치가 방문되지 않았고, 안전 영역이라면 탐색 시작
                    if (!visited[i][j] && map[i][j] > height) {
                        cnt += dfs(i, j, height); // 해당 안전영역 탐색 시작
                    }

                }
            }
            max = Math.max(max, cnt);
        }
        System.out.println(max);
    }
    // 안전 영역 DFS탐색
    static int dfs(int x, int y, int height) {
        visited[x][y] = true; // 현재 위치를 방문 처리

        // 사방탐색 수행
        for (int i = 0; i < 4; i++) {
            int ni = x + di[i];
            int nj = y + dj[i];

            // 경계 체크
            if (ni < 0 || nj < 0 || ni > n - 1 || nj > n - 1) {
                continue;
            }
            // 방문 여부 및 안전 영역 조건 확인
            if (visited[ni][nj]) {
                continue;
            }
            if (map[ni][nj] > height) {
                dfs(ni, nj, height);
            }
        }
        return 1;
    }
}

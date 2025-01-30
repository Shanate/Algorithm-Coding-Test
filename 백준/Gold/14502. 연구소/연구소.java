import java.io.*;
import java.util.*;

public class Main {

    static int n, m;
    static int[][] map;
    static int maxSafeArea = Integer.MIN_VALUE;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        map = new int[n][m];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < m; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        creatWall(0);

        System.out.println(maxSafeArea);

    } // main

    static void creatWall(int wall) {
        if(wall == 3){ // 종료조건
            countSafeArea();
            return;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (map[i][j] == 0) {
                    map[i][j] = 1;
                    creatWall(wall + 1);
                    map[i][j] = 0;
                }
            }
        }
    }

    static void countSafeArea() {
        int[][] copyMap = new int[n][m];
        for (int i = 0; i < n; i++) {
            copyMap[i] = Arrays.copyOfRange(map[i], 0, m);
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (copyMap[i][j] == 2) {
                    virus(copyMap, i, j);
                }
            }
        }
        int cnt=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (copyMap[i][j] == 0) {
                    cnt++;
                }
            }
        }
        maxSafeArea = Math.max(cnt, maxSafeArea);
    }

    static void virus(int[][] copyMap, int r, int c) {
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{r, c});

        while(!q.isEmpty()) {
            int[] cur = q.poll();

            for(int i = 0; i < 4; i++) {
                int nr = cur[0] + dr[i];
                int nc = cur[1] + dc[i];

                if (checkIndex(nr, nc) && copyMap[nr][nc] == 0) {
                    copyMap[nr][nc] = 3;
                    q.offer(new int[]{nr, nc});
                }
            }
        }
    }

    static boolean checkIndex(int r, int c) {
        return r >= 0 && r < n && c >= 0 && c < m;
    }

} // class

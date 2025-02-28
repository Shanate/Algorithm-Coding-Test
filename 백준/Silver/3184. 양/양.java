import java.io.*;
import java.util.*;

public class Main {

    static int[] di = {-1, 0, 1, 0};
    static int[] dj = {0, 1, 0, -1};
    static int N, M;
    static boolean[][] visited;
    static char[][] map;
    static int wolf, sheep;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        wolf = 0;
        sheep = 0;
        map = new char[N][M];
        visited = new boolean[N][M];
        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            for (int j = 0; j < M; j++) {
                map[i][j] = s.charAt(j);
                if(map[i][j] == 'v'){
                    wolf++;
                }
                else if(map[i][j] == 'o'){
                    sheep++;
                }
            }
        }

        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                if(map[i][j] != '#' && !visited[i][j]){
                    bfs(i,j);
                }
            }
        }
        System.out.println(sheep + " " + wolf);
    }

    static void bfs(int r, int c) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{r, c});
        visited[r][c] = true;

        int wolfNum = 0;
        int sheepNum = 0;
        while (!queue.isEmpty()) {
            int[] now = queue.poll();
            r = now[0];
            c = now[1];
            if (map[r][c] == 'o') {
                sheepNum++; 
            } else if (map[r][c] == 'v') {
                wolfNum++; 
            }

            for (int i = 0; i < 4; i++) {
                int nr = r + di[i];
                int nc = c + dj[i];

                if (nr >= 0 && nc >= 0 && nr < N && nc < M && !visited[nr][nc]) {
                    if (map[nr][nc] != '#') { 
                        queue.offer(new int[]{nr, nc});
                        visited[nr][nc] = true;
                    }
                }
            }
            }
            if (sheepNum > wolfNum) wolf -= wolfNum; 
            else sheep -= sheepNum; 
    }
}
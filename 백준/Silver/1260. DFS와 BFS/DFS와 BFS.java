import java.io.*;
import java.util.*;

public class Main {

    static int N, M, V;
    static int[][] g;
    static boolean[] v;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken()); // 정점 개수
        M = Integer.parseInt(st.nextToken()); // 간선 개수
        V = Integer.parseInt(st.nextToken()); // 탐색 시작 정점
        g = new int[N][N]; // 그래프 인접 행렬
        v = new boolean[N]; // 방문 여부 배열

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int from = Integer.parseInt(st.nextToken()) - 1; // 시정점
            int to = Integer.parseInt(st.nextToken()) - 1; // 종정점
            g[from][to] = 1; // 양방향 간선이기 때문에
            g[to][from] = 1; // 동일하게 =1로 설정
        }
        dfs(V - 1); // 탐색 시작 정점부터 시작하기
        System.out.println();
        Arrays.fill(v, false);
        bfs(V - 1);
    }

    static void bfs(int i) {
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        v[i] = true;
        queue.offer(i);
        while(!queue.isEmpty()) {
            i=queue.poll();
            System.out.print((i+1)+" ");
            for(int j=0;j<N;j++) {
                if(g[i][j] != 0 && !v[j]) {
                    v[j] = true;
                    queue.offer(j);
                }
            }
        }
    }

    static void dfs(int i) {
        v[i] = true;
        System.out.print((i+1)+" ");
        for(int j=0;j<N;j++) {
            if(g[i][j] != 0 && !v[j]) {
                dfs(j);
            }
        }
    }
}

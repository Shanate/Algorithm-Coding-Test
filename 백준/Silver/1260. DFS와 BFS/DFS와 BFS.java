// 복습

import java.io.*;
import java.util.*;

public class Main {

    static int N, M, V; // 정점, 간선, 탐색 시작 번호
    static int[][] graph;
    static boolean[] visited;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());
        graph = new int[N][N];
        visited = new boolean[N];

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int from = Integer.parseInt(st.nextToken()) - 1;
            int to = Integer.parseInt(st.nextToken()) - 1;
            graph[from][to] = 1;
            graph[to][from] = 1; // 양방향
        }
        dfs(V - 1);
        System.out.println();
        Arrays.fill(visited, false);
        bfs(V - 1);
    }

    static void bfs(int start) {
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        queue.offer(start);
        visited[start] = true;

        while (!queue.isEmpty()) {
            start = queue.poll();
            System.out.print((start + 1) + " ");

            for (int i = 0; i < N; i++) {
                if (graph[start][i] == 1 && visited[i] == false) {
                    visited[i] = true;
                    queue.offer(i);
                }
            }
        }
    }

    static void dfs(int start) {
        visited[start] = true;
        System.out.print((start + 1) + " ");

        for (int i = 0; i < N; i++) {
            if(graph[start][i] == 1 && visited[i] == false) {
                dfs(i);
            }
        }
    }
}

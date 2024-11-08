import java.io.*;
import java.util.*;

/*
    1   2   3   4
1   0   1   0   1
2   1   0   1   1
3   0   1   0   1
4   1   1   1   0
*/

public class Main {

    static int N, M, R;
    static List<Integer>[] g; // 인접 리스트를 통한 그래프 표현
    static boolean[] visited;
    static int[] order;
    static int count = 1;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken()) - 1; // 시작 정점을 0-based index로 변환
        g = new ArrayList[N]; // 인접 리스트 초기화
        visited = new boolean[N];
        order = new int[N]; // 방문 순서를 기록하는 배열 (미방문 시 0)

        for (int i = 0; i < N; i++) {
            g[i] = new ArrayList<>(); // 각 정점의 인접 리스트 초기화
        }

        // 간선 정보 입력
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int u = Integer.parseInt(st.nextToken()) - 1; // 0-based index로 변환
            int v = Integer.parseInt(st.nextToken()) - 1;
            g[u].add(v);
            g[v].add(u); // 양방향 그래프
        }

        // 각 정점의 인접 리스트를 오름차순으로 정렬
        for (int i = 0; i < N; i++) {
            Collections.sort(g[i]);
        }

        bfs(R); // BFS 실행

        // 방문 순서 출력
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(order[i]).append("\n");
        }
        System.out.print(sb);
    }

    static void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        visited[start] = true;
        queue.offer(start);
        order[start] = count++; // 시작 정점의 방문 순서 기록

        while (!queue.isEmpty()) {
            int current = queue.poll();

            for (int neighbor : g[current]) { // 현재 정점의 모든 인접 정점 탐색
                if (!visited[neighbor]) { // 방문하지 않은 인접 정점일 경우
                    visited[neighbor] = true;
                    queue.offer(neighbor);
                    order[neighbor] = count++; // 방문 순서 기록
                }
            }
        }
    }
}

/* 메모리 초과
public class Main_bj_24444_알고리즘수업너비우선탐색1_Shanate {

        static int N, M, R;
        static int[][] g;
        static boolean[] visited;
        static int[] order;
        static int u, v;
        static int count = 1;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken()) - 1;
        g = new int[N][N];
        visited = new boolean[N];
        order = new int[N];

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            u = Integer.parseInt(st.nextToken()) - 1;
            v = Integer.parseInt(st.nextToken()) - 1;
            g[u][v] = 1;
            g[v][u] = 1; // 양방향 그래프
        }
        bfs(R);

        // 방문 순서 출력
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(order[i]).append("\n");
        }
        System.out.print(sb);
    }

    static void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        visited[start] = true;
        queue.offer(start);
        order[start] = count++; // 시작 정점의 방문 순서 기록

        while (!queue.isEmpty()) {
            int current = queue.poll();

            for (int j = 0; j < N; j++) { // 모든 정점 확인 (0부터 N-1까지)
                if (g[current][j] == 1 && !visited[j]) { // 연결된 정점이고 방문하지 않은 경우
                    visited[j] = true;
                    queue.offer(j);
                    order[j] = count++; // 방문 순서 기록
                }
            }
        }
    }
}*/

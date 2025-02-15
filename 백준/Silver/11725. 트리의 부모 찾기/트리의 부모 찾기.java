import java.io.*;
import java.util.*;

public class Main {

    static int n;
    static ArrayList<Integer>[] list; // 트리
    static int[] parent; // 각 노드의 부모
    static boolean[] visited;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        parent = new int[n + 1];
        list = new ArrayList[n + 1];
        visited = new boolean[n + 1];

        for (int i = 1; i <= n; i++) {
            list[i] = new ArrayList<>(); // 인접 리스트 초기화
        }
        for (int i = 1; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            list[x].add(y); // 양방향
            list[y].add(x);
        }

        bfs(1);

        for (int i = 2; i <= n; i++) {
            System.out.println(parent[i]);
        }
    }

    static void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>(); // 부모 노드를 순서대로 출력하기 위한 큐
        queue.add(start);
        visited[start] = true;
        while (!queue.isEmpty()) {
            int node = queue.poll();
            for (int child : list[node]) { // node가 1일 때, 4와 6을 탐색
                if (!visited[child]) { // 방문하지 않은 자식 노드라면
                    parent[child] = node; // 1은 해당 자식의 부모가 된다.
                    visited[child] = true;
                    queue.add(child); // 큐에 저장
                }
            }
        }
    }
}

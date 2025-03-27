// 그래프 문제로 판명
// 왜 이 문제에서 ArrayList를 사용하는가
import java.io.*;
import java.util.*;

public class Main {

    static int n, m, k, x;
    static ArrayList<Integer>[] graph;
    static int[] distance;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        n = Integer.parseInt(st.nextToken()); // 도시 수
        m = Integer.parseInt(st.nextToken()); // 도로 수
        k = Integer.parseInt(st.nextToken()); // 거리 정보
        x = Integer.parseInt(st.nextToken()); // 출발 도시 번호

        graph = new ArrayList[n + 1];
        int[] distance = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int from = Integer.parseInt(st.nextToken());
            int   to = Integer.parseInt(st.nextToken());
            graph[from].add(to);
        }

        Arrays.fill(distance, -1);
        distance[x] = 0;

        Queue<Integer> queue = new LinkedList<>();
        queue.add(x);

        while (!queue.isEmpty()) {
            int current = queue.poll();

            for (int next : graph[current]) {
                if (distance[next] == -1) {
                    distance[next] = distance[current] + 1;
                    queue.add(next);
                }
            }
        }

        boolean found = false;
        for (int i = 1; i <= n; i++) {
            if (distance[i] == k) {
                System.out.println(i);
                found = true;
            }
        }

        if (!found) {
            System.out.println(-1);
        }

    }
}

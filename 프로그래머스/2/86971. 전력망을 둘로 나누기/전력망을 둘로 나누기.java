import java.util.*;

class Solution {
    // BFS를 사용하여 특정 정점으로부터 연결된 노드의 개수 계산
    static int bfs(List<List<Integer>> graph, int start, int n) {
        boolean[] visited = new boolean[n + 1];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[start] = true;
        int count = 0;

        while (!queue.isEmpty()) {
            int node = queue.poll();
            count++;

            for (int neighbor : graph.get(node)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }

        return count;
    }



    static int solution(int n, int[][] wires) {
        int answer = -1;

        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] wire : wires) {
            int a = wire[0];
            int b = wire[1];
            graph.get(a).add(b);
            graph.get(b).add(a);
        }


        // 모든 전선의 제거를 시도
        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i < wires.length; i++) {
            int[] wire = wires[i];
            int a = wire[0];
            int b = wire[1];

            // 그래프에서 전선 제거
            graph.get(a).remove((Integer) b);
            graph.get(b).remove((Integer) a);

            // 두 부분 그래프의 전력 계산
            int countA = bfs(graph, a, n);
            int countB = n - countA;

            // 전선 제거 후 차이 계산
            minDiff = Math.min(minDiff, Math.abs(countA - countB));

            // 그래프 복원
            graph.get(a).add(b);
            graph.get(b).add(a);
        }


        answer = minDiff;


        return answer;
    }

}
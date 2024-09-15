import java.io.*;
import java.util.*;
/*
중심 노드에서 각 노드까지의 간선 수를 카운팅해서 그걸 정렬하면 될 듯 하다.
그러면 어떤 알고리즘으로 간선 수를 카운팅할까?
BFS가 구현하기엔 가장 쉬워보인다.
*/
class Solution {
    static int solution(int n, int[][] edge) {
        int answer = 0;
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>(); // 그래프를 인접 리스트 방식으로 표현
        ArrayDeque<Integer> queue = new ArrayDeque<>(); // BFS 방식 사용
        int[] distance = new int[n + 1]; // 거리 기록 배열
        boolean[] v = new boolean[n + 1]; // 방문 배열
        int cnt = 0;

        for (int i = 0; i <= n; i++) { // i<=n : 노드와 인덱스 번호 일치해서 헷갈림 줄이기 위함.
            graph.add(new ArrayList<>());
        }

        // 만일 i<n 이었다면 연결은 다음과 같아짐.
        /*
            for (int[] e : edge) {
            graph.get(e[0] - 1).add(e[1] - 1);
            graph.get(e[1] - 1).add(e[0] - 1);  // 양방향 연결
        }*/
        for (int[] e : edge) {
            graph.get(e[0]).add(e[1]);
            graph.get(e[1]).add(e[0]); // 양방향 연결
        }

        // 시작점 1번 노드, 방문 처리, 거리 0
        queue.offer(1);
        v[1] = true;
        distance[1] = 0;

        while(!queue.isEmpty()) {
            int cur = queue.poll(); // 현재 노드

            // 현재 노드에서 인접한 노드 탐색
            for (int next : graph.get(cur)) {
                if (!v[next]) {
                    distance[next] = distance[cur] + 1;
                    v[next] = true;
                    queue.offer(next);
                }
            }
        }
        // 먼 거리 구하기
        int maxDistance = 0;
        for (int i = 0; i < distance.length; i++) {
            if (distance[i] > maxDistance) {
                maxDistance = distance[i];
            }
        }
//      int maxDistance = Arrays.stream(distance).max().getAsInt(); GPT가 알려준 표현

        // 먼 거리 노드 개수 카운팅
        for(int dist : distance) {
            if ( dist == maxDistance) {
                cnt++;

            }
        }
        answer = cnt;

        return answer;
    }
}
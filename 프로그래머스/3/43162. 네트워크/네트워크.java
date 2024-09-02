import java.util.*;
class Solution {
    static void dfs(int cpu, boolean[] v, int[][] computers) {
        v[cpu] = true;

        for(int i=0; i<computers.length; i++) {
            if(v[i] == false && computers[cpu][i] == 1){
                dfs(i, v, computers);
            }
        }
    }
    static int solution(int n, int[][] computers) {
        int answer = 0; // 카운트
        boolean[] v = new boolean[computers.length];

        Arrays.fill(v, false); // 방문 처리 초기화

        for(int i=0; i<computers.length; i++) {
            if(v[i] == false) {
                answer++;
                dfs(i, v, computers);
            }
        }
        return answer;
    }
}
import java.io.*;
import java.util.*;

/*
k = 현재 필요도
i = 최소 필요 피로도
j = 소모 피로도
던전을 탐색할 수 있는 모든 경우의 수를 돌려봐야 함.
1->2->3 |   1->3->2 |   2->1->3 |   2->3->1 |   3->1->2 |   3->2->1
*/
class Solution {
    static int answer;
    static boolean[] visited; // 방문 확인
   
        static void perm(int k, int[][] dungeons, int count) {
        for(int i=0; i<dungeons.length; i++) {
            if(!visited[i] && k>= dungeons[i][0]) { // 처음 가는 던전이면서 내 피로도가 요구치보다 높을 때
                visited[i] = true;  // 던전 입장

                perm(k-dungeons[i][1], dungeons, count+1); // 현재 내 피로도를 뺀 상태로 다음 던전 탐색

                visited[i] = false; // 백트래킹
            }
        }

        answer = Math.max(answer, count); // 과거 최대 방문한 경우와 현재 경우를 비교

    }
    
    public int solution(int k, int[][] dungeons) {
        answer = -1;
        visited = new boolean[dungeons.length];
        perm(k, dungeons, 0);
        return answer;
    }
}
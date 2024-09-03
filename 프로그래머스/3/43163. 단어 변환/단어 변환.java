import java.util.*;
class Solution {
        static int answer;
        static boolean[] visited;

    static int solution(String begin, String target, String[] words) {
        answer = 0;
        visited = new boolean[words.length];

        Arrays.fill(visited, false);

                dfs(begin, target, words, 0);
                return answer;
    }

    static void dfs(String cur, String target, String[] words, int depth) {
        if(cur.equals(target)) { // 종료
            answer = depth;
            return;
        }

        for(int i = 0; i < words.length; i++) {
            if(visited[i]) { // 중복 방문 제거 처리
                continue;
            }
            int k = 0;
            for(int j=0; j<cur.length(); j++){ // 현재 단어와 문자열 비교
                if(cur.charAt(j) == words[i].charAt(j)) {
                    k++;
                }
            }
            if(k==cur.length()-1) { // 일치한 문자열 갯수 = 현재 단어에서 한 글자 뺀 경우의 갯수
                visited[i] = true;
                dfs(words[i], target, words, depth + 1);
                visited[i] = false;
            }
        }
    }
}
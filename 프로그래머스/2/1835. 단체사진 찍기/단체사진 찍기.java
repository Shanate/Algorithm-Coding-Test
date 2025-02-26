class Solution {
     static char[] friends;
    static boolean[] visited;
    static int answer;
    static String[] dt;

    static int solution(int n, String[] data) {
        answer = 0;
        dt = data;
        friends = new char[]{'A', 'C', 'F', 'J', 'M', 'N', 'R', 'T'};
        visited = new boolean[8]; // 줄을 섰으면 true, 아직 안 섰으면 false

        dfs("", 0);

        return answer;
    }

    static void dfs(String friend, int depth) {
        if(depth == friends.length) { // 종료조건
            if (check(friend)) {
                answer++;
                }
                return;
            }

            for (int i = 0; i < friends.length; i++) {
                if (!visited[i]) {
                    visited[i] = true;
                    dfs(friend + friends[i], depth + 1);
                    visited[i] = false;
                }
            }

        }



    static boolean check(String friend) {
        for (String input : dt) {
            int first = friend.indexOf(input.charAt(0));
            int second = friend.indexOf(input.charAt(2));
            char operation = input.charAt(3);
            int ans = input.charAt(4) - '0';
            int diff = Math.abs(first - second) - 1;

            if (operation == '=' && diff != ans) return false;
            if (operation == '>' && diff <= ans) return false;
            if (operation == '<' && diff >= ans) return false;
        }
        return true;
    }
}
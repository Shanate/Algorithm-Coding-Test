import java.util.*;
class Solution {
        static int[] dx = {-1, 0, 1, 0}; // 상 우 하 좌
        static int[] dy = {0, 1, 0, -1};
        static boolean[][] v;
        
    static int solution(int[][] maps) {
        int answer = 1;
        int n = maps.length;
        int m = maps[0].length;

        v = new boolean[n][m];

        ArrayDeque<int[]> q = new ArrayDeque<>();
        q.offer(new int[] {0, 0});
        v[0][0] = true;

        while (!q.isEmpty()) {
            int size = q.size();

            for (int i = 0; i < size; i++) {
                int[] current = q.poll();
                int x = current[0];
                int y = current[1];

                // 도착 지점에 도달했는지 확인
                if (x == n - 1 && y == m - 1) {
                    return answer;
                }

                // 상하좌우 이동
                for (int j = 0; j < 4; j++) {
                    int newX = x + dx[j];
                    int newY = y + dy[j];

                    // 유효한 위치인지, 방문한 적이 없는지, 벽이 아닌지 확인
                    if (newX >= 0 && newX < n && newY >= 0 && newY < m && !v[newX][newY] && maps[newX][newY] == 1) {
                        q.add(new int[]{newX, newY});
                        v[newX][newY] = true;
                    }
                }
            }
            answer++;
        }
        return -1;
    }
}
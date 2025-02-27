import java.util.*;

class Solution {
    
    static int[] di = {-1, 0, 1, 0}; 
    static int[] dj = {0, -1, 0, 1};
    static boolean[][] visited;
    static int n;
    static int m;
    
    public int solution(int[][] maps) {
        int answer = 1;
        n = maps.length;
        m = maps[0].length;
        visited = new boolean[n][m];
        
        ArrayDeque<int[]> queue = new ArrayDeque<>();
        queue.offer(new int[]{0,0});
        visited[0][0] = true;
        
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int num=0; num< size; num++){
                int[] current = queue.poll();
                int x = current[0];
                int y = current[1];
                
                if (x== n-1 && y == m-1){
                    return answer;
                }
                for(int k=0; k<4; k++){
                    int nx = x + di[k];
                    int ny = y + dj[k];
                    
                    if(nx>=0 && nx < n && ny>=0 && ny<m && !visited[nx][ny] && maps[nx][ny] == 1){
                        queue.offer(new int[]{nx, ny});
                        visited[nx][ny] = true;
                    }
                }
            }
            answer++;
        }
        return -1;

    }
}
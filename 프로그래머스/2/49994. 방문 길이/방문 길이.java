class Solution {
    // U, D, R, L
    static int[] di = {0, 0, 1, -1};
    static int[] dj = {-1, 1, 0, 0};
    static int[] opp = {1, 0, 3, 2};
    static boolean[][][] visited;
    
    public int solution(String dirs) {
        int answer = 0;
        visited = new boolean[11][11][4];
        int curX = 5; // 현재 위치
        int curY = 5; // 현재 위치
        
        for(int i=0; i<dirs.length(); i++){
            int d=0;

            if(dirs.charAt(i) == 'U'){
                d=0;
            }
            else if(dirs.charAt(i) == 'D'){
                d=1;
            }
            else if(dirs.charAt(i) == 'R'){
                d=2;
            }
            else if(dirs.charAt(i) == 'L'){
                d=3;
            }
            int nr = curX + di[d]; // 움직일 위치
            int nc = curY + dj[d]; // 움직일 위치
            
            if (nr >= 0 && nr <= 10 && nc >= 0 && nc <= 10) {
                if (!visited[curX][curY][d] && !visited[nr][nc][opp[d]]){
                    visited[curX][curY][d] = true;
                    visited[nr][nc][opp[d]] = true;
                    answer++;
            }
                
            curX = nr;
            curY = nc;
            
        } // for
    }
        
        return answer;
    }
}
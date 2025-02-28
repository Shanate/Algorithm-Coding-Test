import java.util.*;

class Solution {
    
    static boolean[][][] visited;
    // 상(U), 우(R), 하(D), 좌(L)
    static int[] di = {-1, 0, 1, 0}; // 행
    static int[] dj = {0, 1, 0, -1}; // 열
    static int[] opp = {2, 3, 0, 1};
    
    public int solution(String dirs) {
        int answer = 0; // 처음 걸어본 길의 길이 카운트
        visited = new boolean[11][11][4];
        
        int nowX = 5;
        int nowY = 5;
        
        for(int i=0; i<dirs.length(); i++){
            char parse = dirs.charAt(i);
            int arrow = 0;

            if(parse == 'U'){
                arrow = 0;
            }
              else if(parse == 'R'){
                arrow = 1;
            } else if(parse == 'D'){
                arrow = 2;
            } else if(parse == 'L'){
                arrow = 3;
            }
            int cursorX = nowX + di[arrow];
            int cursorY = nowY + dj[arrow];
            
            if(cursorX>=0 && cursorX<11 && cursorY>=0 && cursorY<11){
                if(!visited[cursorX][cursorY][arrow] && !visited[nowX][nowY][opp[arrow]]){
                    visited[cursorX][cursorY][arrow] = true;
                    visited[nowX][nowY][opp[arrow]] = true;
                    answer++;
                }
                
                nowX = cursorX;
                nowY = cursorY;
                
            }
            
        } // for i
        
        return answer;
    }
}
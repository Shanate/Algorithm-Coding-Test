import java.util.*;
class Solution {
    public int solution(int[] arrows) {
        int answer = 0;
        int minW = 0, maxW = 0, minH = 0, maxH = 0;
        int width = 0, height = 0;
        
        for(int i = 0; i < arrows.length; i++) {
            if (arrows[i] == 0 || arrows[i] == 1 || arrows[i] == 7)
                height++;
            maxH = Math.max(maxH, height);
            if (arrows[i] == 3 || arrows[i] == 4 || arrows[i] == 5)
                height--;
            minH = Math.min(minH, height);
            if (arrows[i] == 1 || arrows[i] == 2 || arrows[i] == 3)
                width++;
            maxW = Math.max(maxW, width);
            if (arrows[i] == 5 || arrows[i] == 6 || arrows[i] == 7)
                width--;
            minW = Math.min(minW, width);
        }
        int x = maxH, y = -minW; //원점의 위치
        width = maxW - minW + 1;
        height = maxH - minH + 1;
        
        //좌표 (a,b)가 어떤 좌표와 연결되어있는지
        HashMap<Integer, ArrayList<Integer>> connect = new HashMap<>();
        connect.put(x*width+y, new ArrayList<>());
        
        boolean[][] visited = new boolean[height][width];
        visited[x][y] = true; //시작점은 이미 지나간거니까
        for(int i = 0; i < arrows.length; i++) {
            int prev_x = x, prev_y = y;
            
            if (arrows[i] == 0 || arrows[i] == 1 || arrows[i] == 7)
                x -= 1;
            if (arrows[i] == 3 || arrows[i] == 4 || arrows[i] == 5)
                x += 1;
            if (arrows[i] == 1 || arrows[i] == 2 || arrows[i] == 3)
                y += 1;
            if (arrows[i] == 5 || arrows[i] == 6 || arrows[i] == 7)
                y -= 1;
            // //방문하지 않은 점이면 Map에도 해당 점 원소 추가
            if (!connect.containsKey(x*width+y)) {
                connect.put(x*width+y, new ArrayList<>());
            }
            //해당 점을 한번 더 방문하고, 이전에 그어지지 않았던 선이면
            if (visited[x][y] == true) { 
                if (connect.get(x*width+y).contains(prev_x*width+prev_y) == false)
                    answer++;
            }
            //대각선 검사 : 교차할때 방 만들어짐, 단 이미 그었던 선은 안됨.
            if (connect.get(x*width+y).contains(prev_x*width+prev_y) == false) {
                if (arrows[i] == 7 && connect.containsKey((x+1)*width+y)) 
                    if (connect.get((x+1)*width+y).contains(x*width+(y+1)) == true) 
                            answer++;
                if (arrows[i] == 5 && connect.containsKey((x-1)*width+y)) 
                    if (connect.get((x-1)*width+y).contains(x*width+(y+1)) == true)
                            answer++;
                if (arrows[i] == 3 && connect.containsKey((x-1)*width+y)) 
                    if (connect.get((x-1)*width+y).contains(x*width+(y-1)) == true)
                            answer++;
                if (arrows[i] == 1 && connect.containsKey(x*width+(y-1)))
                    if (connect.get(x*width+(y-1)).contains((x+1)*width+y) == true)
                            answer++;
            }
            if (visited[x][y] == false) {
                visited[x][y] = true;
            }
            // 점 연결
            connect.get(x*width+y).add(prev_x*width+prev_y);
            connect.get(prev_x*width+prev_y).add(x*width+y);
        }
        return answer;
    }
}
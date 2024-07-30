import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length]; // commands.length = 3
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=0; i<commands.length; i++){
            for(int j=commands[i][0]; j<=commands[i][1]; j++){
                list.add(array[j-1]); // 시점 e ~ 종점 e를 list에 추가
            }
            Collections.sort(list); // 배열 다 뽑아낸 후 정렬
            answer[i] = list.get(commands[i][2]-1); // K번째 e 추출
            list.clear(); // list 배열 초기화
        }
        
        return answer;
    }
}
import java.util.*;
// 받은 입력값을 정렬.
// H : 논문 인용 횟수 >= H회 이상 인용된 논문의 개수
class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations);
        for(int i=0; i<citations.length; i++){
            int H = citations.length - i;// 논문 인용 횟수
            if(citations[i] >= H){
                answer = H;
                break;
            }
        }
        // H = 5-0
        // citations[0] = 0 >= 5 X
        // H = 5-1
        // citations[1] = 1 >= 4 X
        // H = 5-2
        // citations[2] = 3 >= 3
        return answer;
    }
}
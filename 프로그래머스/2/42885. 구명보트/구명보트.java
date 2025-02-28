import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        int idx = 0;
        int lastIdx = people.length-1;
        Arrays.sort(people);
        
        for(int i=lastIdx; i >= idx; i--){
            if(people[idx] + people[i] <= limit){
                idx++;
                answer++;
            } else{
                answer++;
            }
        }
        
        return answer;
    }
}
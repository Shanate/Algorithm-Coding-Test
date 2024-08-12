import java.util.*;
class Solution {
    static int solution(int[] priorities, int location) {
        int answer = 0;

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0; i < priorities.length; i++) {
            pq.offer(priorities[i]);
        }   // [2, 1, 3, 2] -> [3, 2, 2, 1]
        while(!pq.isEmpty()) {
            for(int i = 0; i < priorities.length; i++) {
                if(pq.peek() == priorities[i]) {
                    pq.poll();
                    answer += 1;
                    if(location == i){
                        return answer;
                    }
                }
            }
        }
        return answer;
    }
}
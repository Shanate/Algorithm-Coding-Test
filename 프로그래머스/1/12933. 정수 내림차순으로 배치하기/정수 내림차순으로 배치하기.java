import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        StringBuilder sb = new StringBuilder();
        
        String str = Long.toString(n);
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0; i<str.length();i++){
            pq.add(str.charAt(i)-'0');
        }
        for(int i=0; i<str.length(); i++){
            answer = pq.poll();
            sb.append(answer);
        }
        answer = Long.parseLong(sb.toString());
        return answer;
    }
}
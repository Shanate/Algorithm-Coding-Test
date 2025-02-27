import java.util.*;

class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        int sum = 0;
        PriorityQueue<Integer> pq1 = new PriorityQueue<>();
        PriorityQueue<Integer> pq2 = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0; i<A.length; i++){
            pq1.add(A[i]);
            pq2.add(B[i]);
        }
        
        
        for(int i=0; i<A.length; i++){
            sum += pq1.poll() * pq2.poll();
        }
        answer = sum;

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
}
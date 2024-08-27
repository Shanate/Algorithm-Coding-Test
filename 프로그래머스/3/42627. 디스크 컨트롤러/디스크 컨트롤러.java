import java.util.*;
class Solution {
    public int solution(int[][] jobs) {
        int answer = 0;
        int index = 0;
        int count = 0;
        int time = 0; // 끝난 시간

        Arrays.sort(jobs, (o1, o2) -> o1[0] - o2[0]); // 시작시간 오름차순 // 0, 1, 2
        PriorityQueue<int[]> pq = new PriorityQueue<>((o1, o2) -> o1[1] - o2[1]); // 처리시간 오름차순 // 3, 6, 9

        while(count < jobs.length) {
        // 한 작업이 끝날 때까지 들어온 모든 요청 작업을 큐에 넣는다.
            while(index < jobs.length && jobs[index][0] <= time){
                // 0 < 3 && 0 <= 0 -> [0, 3]
                // 1 < 3 && 1 <= 0 -> [1, 6]
                // 2 < 3 && 2 <= 0 -> [2, 9]
                pq.offer(jobs[index++]);
            }
        // 작업이 끝나기 전 들어온 요청 중 가장 수행시간이 짧은 요청부터 수행
            if(!pq.isEmpty()){
                int[] temp = pq.poll(); // 0 poll
                answer += temp[1] + time - temp[0]; // 3
                time += temp[1]; // 3
                count++; // 0
            }
        // 큐가 비어있을 시 작업 완료 이후에 다시 요청이 들어온다
            else {
                time = jobs[index][0];
            }

        }
        return (int) Math.floor(answer/jobs.length);
    }
}
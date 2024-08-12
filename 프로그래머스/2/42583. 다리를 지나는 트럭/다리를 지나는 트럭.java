import java.util.*;
class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
            int answer = 0;

            ArrayDeque<Integer> queue = new ArrayDeque<>();
            int sum = 0;

        for(int truck : truck_weights) {

            while(true){
                // 다리에 트럭이 없는 경우
                if(queue.isEmpty()){
                    queue.offer(truck);
                    sum += truck;
                    answer++;
                    break;
                }
                // 다리가 꽉 찬 경우
                else if(queue.size()==bridge_length){
                    sum -= queue.poll();
                }
                else{ // 차지 않았을 경우

                    // 트럭이 올라올 수 있을 경우
                    if(sum+truck<=weight){
                        queue.offer(truck);
                        sum += truck;
                        answer++;
                        break;
                    }
                    //다리 트럭 무게가 초과인 경우
                    else {
                        queue.offer(0);
                        answer++;
                    }
                }

            }

        }
            answer += bridge_length;

            return answer;
}
}
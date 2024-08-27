import java.util.*;
class Solution {
    public int[] solution(String[] operations) {
        int[] answer = new int[2];
        PriorityQueue<Integer> descPQ = new PriorityQueue<>(Collections.reverseOrder()); // 최대->최소, 내림차순
        PriorityQueue<Integer> ascPQ = new PriorityQueue<>(); // 최소->최대, 오름차순
//        ArrayList<Integer> list = new ArrayList<>();

        for (String operation : operations) {
            String[] tokens = operation.split(" ");
            int num = Integer.parseInt(tokens[1]);
            if(tokens[0].equals("I")){
                descPQ.offer(num); ascPQ.offer(num);
//                list.add(num);
            }
            else if(tokens[0].equals("D")){
                if(num == -1){
                    descPQ.remove(ascPQ.poll());
                }
                else if(num == 1){
                    ascPQ.remove(descPQ.poll());
                }
            }
            answer[0] = !descPQ.isEmpty() ? descPQ.peek() : 0;
            answer[1] = !ascPQ.isEmpty() ? ascPQ.peek() : 0;

/*            if(descPQ.isEmpty()){
                answer[0] = 0;
            } else{
                answer[0] = descPQ.peek();
            }
*/
        }
        return answer;
    }
}
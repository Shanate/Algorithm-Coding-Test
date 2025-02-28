import java.util.*;

class Solution {
    
    static int[] origin;
    
    public int solution(int[] order) {
        
        int answer = 0;
        // origin = new int[order.length];
        Queue<Integer> origin = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();
        
        for(int i=1; i<=order.length; i++){
            origin.offer(i); // 택배 기본 배열
        }
        // origin과 stack에서의 택배가 사라질 때까지
        while(!origin.isEmpty() || !stack.isEmpty()){
            // order에 당장 넣을 택배가 있는지를 확인. 있다.
                if(!origin.isEmpty() && origin.peek() == order[answer]){
                    origin.poll();
                    answer++;
                }
            else if(!stack.isEmpty() && stack.peek() == order[answer]){
                stack.pop();
                answer++;
            }
            else if(!origin.isEmpty() && origin.peek() != order[answer]){
                stack.push(origin.poll());
            }
            // order에 당장 넣을 택배가 있는지를 확인. 없다.
            else {
                break;
            }
        }
        
        
        return answer;
    }
}
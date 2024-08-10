import java.util.*;

public class Solution {
    static int[] solution(int []arr) {
        int[] answer = {};
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if(stack.isEmpty() || stack.peek() != arr[i]){
                stack.push(arr[i]);
            }
        }
        answer = new int [stack.size()];
        for (int i=0; i<answer.length; i++){
            answer[i] = stack.get(i);
        }
        return answer;
    }
}
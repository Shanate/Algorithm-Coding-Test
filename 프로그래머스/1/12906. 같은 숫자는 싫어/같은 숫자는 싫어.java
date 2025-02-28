import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        
        Stack<Integer> stack = new Stack<>();
        
        for(int i=0; i<arr.length; i++){
            
            if(stack.isEmpty() || stack.peek() != arr[i]){
                stack.push(arr[i]);
            }
        }
          answer = new int[stack.size()];
            
            for(int i=0; i<answer.length; i++){
                answer[answer.length -i-1] = stack.pop();
            }
        
        return answer;
    }
}
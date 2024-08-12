import java.util.*;
class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        ArrayDeque<Integer> stack = new ArrayDeque<>();
            for(int i = 0; i < prices.length; i++) {
                // 주식이 증가하거나 동일할 경우에는 stack을, 주식이 떨어졌을 경우에는 answer에 넣으면서 종결한다.
                while(!stack.isEmpty() && prices[i] < prices[stack.peek()]) {
                    answer[stack.peek()] = i - stack.peek();
                    stack.pop();
                }
                stack.push(i);
            }
        while (!stack.isEmpty()) {
            answer[stack.peek()] = prices.length - stack.peek() - 1;
            stack.pop();
        }
        return answer;
    }
}
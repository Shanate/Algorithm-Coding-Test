import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
       ArrayDeque<Character> stack = new ArrayDeque<>();

        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == '(') { // 개괄호일 경우 스택에 저장
                stack.push(c);
            }
            else if(c == ')'){ // 폐괄호일 경우
                if(stack.isEmpty()) { // case10 스택이 비었을 때(첫장부터 밑장빼기), 탐색 종료
                    answer = false;
                    return answer;
                }
                else{   // 개괄호가 있음을 의미 -> 추출해버린다
                    stack.pop();
                }
            }
        }
        if(stack.isEmpty()) {
            answer = true;
        }
        else {
            answer = false;
        }

        return answer;
    }
}
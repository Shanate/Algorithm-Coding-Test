import java.io.*;
import java.util.*;
public class Main {

    static String ans(String str) {
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);

            if(c == '('){ // 개괄호일 경우 스택에 저장
                stack.push(c);
            }
            else if(c == ')'){ // 폐괄호일 경우
                if(stack.empty()){ // case1) 스택이 비었을 때, 자동적으로 NO 반환
                    return "NO";
                }
                else{ // case2) 스택이 있기 때문에, 삭제
                    stack.pop();
                }
            }
        }

        if(stack.empty()){
            return "YES";
        }
        else {
            return "NO";
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++){
            sb.append(ans(br.readLine())).append('\n');
        }
        System.out.println(sb);
    }
}
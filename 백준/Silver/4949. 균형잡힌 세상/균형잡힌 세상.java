import java.io.*;
import java.util.*;
public class Main {
    static String ans(String str) {
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            if(c=='(' || c=='['){ // 개괄호일 경우 stack에 삽입
                stack.push(c);
            }
            else if(c == ')'){
                if(stack.empty() || stack.peek() != '('){
                    return "no";
                }
                else{
                    stack.pop();
                }
            }
            else if(c == ']'){
                if(stack.empty() || stack.peek() != '['){
                    return "no";
                }
                else{
                    stack.pop();
                }
            }
        }
        if(stack.empty()) {
            return "yes";
        }
            else{
                return "no";
            }
        }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
        StringBuffer sb = new StringBuffer();
        String str;
        while(true){
            str = br.readLine();
            if(str.equals(".")){
                break;
            }
            sb.append(ans(str)).append('\n');
        }
        System.out.println(sb);
    }
}
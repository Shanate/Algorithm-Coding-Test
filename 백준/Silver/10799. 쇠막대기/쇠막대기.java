import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        Stack<Character> stack = new Stack<>();

        int cnt = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == '(') {
                stack.push(ch);
            } else { // ch == ')'
                stack.pop();

                if (str.charAt(i - 1) == '(') {
                    cnt += stack.size();
                } else {
                    cnt += 1;
                }
            }
        }
        System.out.println(cnt);
    }
}

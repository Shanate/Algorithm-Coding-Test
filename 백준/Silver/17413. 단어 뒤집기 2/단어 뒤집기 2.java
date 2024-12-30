import java.io.*;
import java.util.*;

/*
a-z, 0-9, ' ', <, >
< 와 >는 번갈아서 나오며 < > 안은 뒤집지 않는다.
<가 입력되면 그대로 열어두고, >가 들어오면 닫고 뒤집는다. -> <를 보고 열어두는 체크와 >를 보고 닫는 체크가 필요하다.
즉, <가 보이기 전까지는 들어온 문자열을 스택에 저장하고, >가 보이면 태그 안의 문자열을 그대로 출력한다.

스택 : Last In First Out(위만 열린 상자)

*/

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();
        Stack<Character> stack = new Stack<>();

        // check는 <와 >를 판별하기 위함.
        boolean check = false;

        for (int i = 0; i < str.length(); i++) {
            char spell = str.charAt(i);
            // <가 나올 경우, 스택에서 모든 원소를 꺼낸다.
            if (spell == '<') {
                while (!stack.isEmpty()) {
                    sb.append(stack.pop());
                }
                check = true;
            }
            // >가 나올 경우, 체크 해제 후 >를 저장하고 끝낸다.
            else if (str.charAt(i) == '>') {
                check = false;
                sb.append(str.charAt(i));
                continue;
            }

            // check가 true일 경우(<로 열린 상태), 스택에 저장하지 않고 '>'를 만나기 전까지 그대로 바로바로 입력
            if (check == true) {
                sb.append(str.charAt(i));
            }

            // check가 false일 경우(괄호 바깥에 있는 상태), 뒤집는다.
            else if (check == false) {

                // 공백을 만났을 경우 이전까지의 문자(현재 스택에 남아있는 문자)를 모두 뱉는다.
                if (str.charAt(i) == ' ') {
                    while (!stack.isEmpty()) {
                        sb.append(stack.pop());
                    }
                    sb.append(' ');

                } else {
                    // 이 경우도 아니라면(괄호 안에 있는 상태도 아니고, 공백을 만나지도 않은 상태) 그냥 스택에 일단 저장한다.
                    stack.push(str.charAt(i));
                }
            }

            // 마지막 반복 때, 빈 스택이 아닐경우 뒤집어 출력한다.
            if (i == str.length() - 1) {
                while (!stack.isEmpty()) {
                    sb.append(stack.pop());
                }
            }
        }

        System.out.println(sb);
    }
}
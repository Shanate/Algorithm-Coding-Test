import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        int N = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<N; i++){
        st = new StringTokenizer(br.readLine(), " ");
            int command = Integer.parseInt(st.nextToken());
            if(command == 1) { // 1번 command
                int X = Integer.parseInt(st.nextToken());
                stack.push(X);
            } else if(command == 2) { // 2번 command. 정수 삭제하며 반환, 없을시 -1 반환
                if(stack.empty()){
                    System.out.println(-1);
                } else {
                    System.out.println(stack.pop());
                }
            } else if(command == 3) { // 3번 command. 정수의 개수를 출력
                System.out.println(stack.size());
            } else if(command == 4) { // 4번 command. 스택이 비어있으면 1, 아니면 0을 출력
                if(stack.empty()){
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
            } else if(command == 5) { // 5번 command. 스택에 정수가 있으면 맨 위에 정수를 출력, 없을시 -1 반환
                    if(stack.empty()){
                        System.out.println(-1);
                    } else {
                        System.out.println(stack.peek());
                    }
            }
        }
    } // main
} // class

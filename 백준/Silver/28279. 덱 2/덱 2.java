import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        int N = Integer.parseInt(br.readLine());
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int command = Integer.parseInt(st.nextToken());

            if(command == 1){
                stack.addFirst(Integer.parseInt(st.nextToken()));
            }
            else if(command == 2){
                stack.add(Integer.parseInt(st.nextToken()));
            }
            else if(command == 3){
                if(stack.isEmpty()){
                    System.out.println("-1");
                } else {
                    System.out.println(stack.poll());
                }
            } else if(command == 4){
                if(stack.isEmpty()){
                    System.out.println("-1");
                } else {
                    System.out.println(stack.pollLast());
                }
            } else if(command == 5){
                System.out.println(stack.size());
            } else if(command == 6){
                if(stack.isEmpty()){
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
            } else if(command == 7){
                if(stack.isEmpty()){
                    System.out.println(-1);
                } else {
                    System.out.println(stack.peek());
                }
            } else if(command == 8){
                if(stack.isEmpty()){
                    System.out.println(-1);
                } else {
                    System.out.println(stack.peekLast());
                }
            }
        }

    }
}

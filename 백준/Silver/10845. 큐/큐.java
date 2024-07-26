import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        Queue<Integer> q = new LinkedList<>();
        int N = Integer.parseInt(br.readLine());
        int last = 0;


        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine(), " ");
            String command = st.nextToken();
        if(command.equals("push")){ // 1번 커맨드
            int X = Integer.parseInt(st.nextToken());
            q.offer(X);
            last = X;
        } else if(command.equals("pop")){ // 2번 커맨드
            if(q.isEmpty()){
                System.out.println(-1);
            } else {
                System.out.println(q.poll());
            }
        } else if(command.equals("size")){ // 3번 커맨드
            System.out.println(q.size());
        } else if(command.equals("empty")){ // 4번 커맨드
            if(q.isEmpty()){
                System.out.println(1);
            } else{
                System.out.println(0);
            }
        }

        else if(command.equals("front")){ // 5번 커맨드
            if(q.isEmpty()){
                System.out.println(-1);
            } else{
                System.out.println(q.peek());
            }
        } else if(command.equals("back")) { // 6번 커맨드
            if(q.isEmpty()){
                System.out.println(-1);
            } else{
                System.out.println(last);
            }
        }
        }
    } // main
} // class

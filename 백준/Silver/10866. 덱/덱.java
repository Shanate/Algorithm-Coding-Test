import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine()," ");
            String str = st.nextToken();
            if(str.equals("push_front")){ // front deque
                int num = Integer.parseInt(st.nextToken());
                deque.offerFirst(num);
            }
            else if(str.equals("push_back")){ // back deque
                int num = Integer.parseInt(st.nextToken());
                deque.offerLast(num);
            }
            else if(str.equals("pop_front")){   // front poll
                if(deque.isEmpty()){
                    System.out.println(-1);
                } else{
                    System.out.println(deque.pollFirst());
                }
            }
            else if(str.equals("pop_back")){
                if(deque.isEmpty()){
                    System.out.println(-1);
                } else {
                    System.out.println(deque.pollLast());
                }
            }
            else if(str.equals("size")){
                System.out.println(deque.size());
            }
            else if(str.equals("empty")){
                if(deque.isEmpty()){
                    System.out.println(1);
                } else{
                    System.out.println(0);
                }
            }
            else if(str.equals("front")){
                if(deque.isEmpty()){
                    System.out.println(-1);
                } else{
                    System.out.println(deque.peek());
                }
            }
            else if(str.equals("back")){
                if(deque.isEmpty()){
                    System.out.println(-1);
                } else{
                    System.out.println(deque.peekLast());
                }
            }
        }
    }
}

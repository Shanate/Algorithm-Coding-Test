
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        ArrayDeque<String> q = new ArrayDeque<>();
        ArrayDeque<Integer> num = new ArrayDeque<>();
        int N = Integer.parseInt(br.readLine());
        int pass;
        for(int i=1; i<=N; i++){
            st = new StringTokenizer(br.readLine(), " ");
            String std = st.nextToken();
            int yrs = Integer.parseInt(st.nextToken());
            q.offer(std);
            num.offer(yrs);

        }
        while(q.size() > 1){

            q.poll();
            pass = (num.poll() - 1);
            while(pass != 0){
                q.offer(q.poll());
                num.offer(num.poll());
                pass--;
            }
            q.poll();
            num.poll();
        }
        System.out.println(q.poll());

    } // main
} // class

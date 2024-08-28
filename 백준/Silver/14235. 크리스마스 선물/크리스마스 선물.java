import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0; i < n; i++){
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int a = Integer.parseInt(st.nextToken());
        if(a != 0) {
            for (int j = 0; j < a; j++) {
                pq.offer(Integer.parseInt(st.nextToken()));
                }
            } else{
            if(!pq.isEmpty()){
                System.out.println(pq.poll());
            } else{
                System.out.println("-1");
                }
            }
        }
    }
}

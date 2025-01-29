import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        PriorityQueue<Integer> pq = new PriorityQueue<>();
            st = new StringTokenizer(br.readLine(), " ");
        for (int i = 1; i <= n; i++) {
            int a = Integer.parseInt(st.nextToken());
            pq.add(a);
        }
        while (k-- > 1) {
            pq.poll();
        }
        System.out.println(pq.poll());
    }
}

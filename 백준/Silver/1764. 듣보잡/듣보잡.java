import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine()," ");
    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());
    int count = 0;
    HashSet<String> h1 = new HashSet<>();
    PriorityQueue<String> pq = new PriorityQueue<>();
    for(int i = 0; i < n; i++){
        h1.add(br.readLine());
    }
    for(int i = 0; i < m; i++){
        String ns = br.readLine();
        if(h1.contains(ns)){
            count += 1;
            pq.offer(ns);
        }
    }
        System.out.println(count);
        while(!pq.isEmpty()){
            System.out.println(pq.poll());
        }
    }
}
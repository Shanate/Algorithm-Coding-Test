import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        PriorityQueue<String> pq = new PriorityQueue();
        for (int i = 0; i < str.length(); i++) {
            String postfix = str.substring(i, str.length());
            pq.add(postfix);
        }
        for(int i = 0; i < str.length(); i++){
            System.out.println(pq.poll());
        }

    }
}

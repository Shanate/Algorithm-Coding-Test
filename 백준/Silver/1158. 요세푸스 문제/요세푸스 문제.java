import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        ArrayDeque<Integer> q = new ArrayDeque<>();
        for(int i=1; i<=N; i++){
            q.offer(i);
        }
        System.out.print("<");
        while(q.size() != 1){ // 원소 하나만 남을 때까지 반복
            for(int i=1; i<K; i++){ // K번째 전까지의 원소를 뒤로 보낸다.
                q.offer(q.poll());
            }
            System.out.print(q.poll() + ", ");
        }
        System.out.println(q.poll() + ">");
    }
}
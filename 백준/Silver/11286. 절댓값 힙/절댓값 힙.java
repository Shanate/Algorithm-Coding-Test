import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> pq = new PriorityQueue<>(
                (o1, o2) -> {
                    int abs1 = Math.abs(o1);
                    int abs2 = Math.abs(o2);
                    if (abs1 == abs2) {
                        return Integer.compare(o1, o2); // 절댓값이 같으면 더 작은 값을 우선
                    }
                    return Integer.compare(abs1, abs2); // 절댓값 기준으로 정렬
                });
            for(int i = 0; i < N; i++) {
                int x = Integer.parseInt(br.readLine());

                if(x == 0){
                    if(pq.isEmpty()){
                        System.out.println(0);
                    } else{
                        System.out.println(pq.poll());
                    }
                } else{
                    pq.add(x);
                }
            }
    }
}
import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        HashMap<String, Integer> hashMap = new HashMap<>();
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        int cnt = 0;

        for (int i = 0; i < N; i++) {
            hashMap.put(br.readLine(), 0);
        }
        for (int i = 0; i < M; i++) {
            if (hashMap.containsKey(br.readLine())) {
                cnt++;
            }
        }
        System.out.println(cnt);

    }
}

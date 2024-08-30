import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sum=0;
        int avg=0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<10; i++){
            int n = Integer.parseInt(br.readLine());
            map.put(n, map.getOrDefault(n, 0) + 1);
            sum += n;
        }
        avg = sum/10;

        int mode = -1;
        int maxFrequency = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                maxFrequency = entry.getValue();
                mode = entry.getKey();
            }
        }

        // 결과 출력
        System.out.println(avg);
        System.out.println(mode);
    }
}
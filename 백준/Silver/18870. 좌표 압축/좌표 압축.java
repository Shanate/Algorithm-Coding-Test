import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] arr = new int[n];
        int[] zip = new int[n];
        int cnt = 0;
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            arr[i] = zip[i] = Integer.parseInt(st.nextToken()); // 2 4 -10 4 -9
        }
        Arrays.sort(zip); // 오름차순 정리 // -10 -9 2 4 4

        for(int value : zip){
            if(!map.containsKey(value)){
                map.put(value, cnt);// (-10, 0), (-9, 1), (2, 2), (4, 3), (4, 3)
                cnt++;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int key : arr){
            int rank = map.get(key);
            sb.append(rank).append(" ");
        }
        System.out.println(sb);
    }
}

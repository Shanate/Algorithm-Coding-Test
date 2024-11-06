import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
        HashSet<Integer> hashSet  = new HashSet<>();

            long n = Integer.parseInt(br.readLine());
                st = new StringTokenizer(br.readLine(), " ");
            for (int i = 0; i < n; i++) {
                int a = Integer.parseInt(st.nextToken());
                hashSet.add(a);
            }
            int m = Integer.parseInt(br.readLine());
                st = new StringTokenizer(br.readLine(), " ");
            for (int i = 0; i < m; i++) {
                int a = Integer.parseInt(st.nextToken());
                if (hashSet.contains(a)) {
                    sb.append("1").append('\n');
                } else{
                    sb.append("0").append('\n');
                }
            }
        }
            System.out.println(sb.toString());
    }
}

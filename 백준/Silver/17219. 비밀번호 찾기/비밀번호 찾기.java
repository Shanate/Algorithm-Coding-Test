import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, String> hashMap = new HashMap<>();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            hashMap.put(st.nextToken(), st.nextToken());
        }
        for (int i = 0; i < m; i++) {
            String str = br.readLine();
            if (hashMap.containsKey(str)) {
                System.out.println(hashMap.get(str));
            }
        }
    }
}

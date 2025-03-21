import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] s = new int[n + 1];
        int max = Integer.MIN_VALUE;

        st = new StringTokenizer(br.readLine(), " ");
        for(int i=1; i<=n; i++){
            int a = Integer.parseInt(st.nextToken());
            s[i] = s[i-1] + a;
        }
        for(int i=k; i<=n; i++){
            max = Math.max(max, s[i] - s[i - k]);
        }
        System.out.println(max);

    }
}

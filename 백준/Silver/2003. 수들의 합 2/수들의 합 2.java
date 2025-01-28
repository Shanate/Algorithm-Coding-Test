import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n + 1];
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int left = 0, right = 0;
        int sum = 0;
        int cnt = 0;

        while(right <= n) {
            if (sum >= m) {
                sum -= arr[left++];
            } else {
                sum += arr[right++];
            }
            if (sum == m) cnt++;
        }
        System.out.println(cnt);
    }
}

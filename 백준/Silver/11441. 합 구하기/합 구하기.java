import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int[] arr = new int[n+1];

        st = new StringTokenizer(br.readLine(), " ");
        for(int i=1; i<=n; i++){
            int a = Integer.parseInt(st.nextToken());
            arr[i] = a + arr[i-1];
        }
        st = new StringTokenizer(br.readLine(), " ");
        int k = Integer.parseInt(st.nextToken());

        for (int num = 0; num < k; num++) {
        st = new StringTokenizer(br.readLine(), " ");
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            System.out.println(arr[j]-arr[i-1]);
        }
    }
}

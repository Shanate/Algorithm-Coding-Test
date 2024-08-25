import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n+1];

        st = new StringTokenizer(br.readLine()," ");
        for(int i=1; i<=n; i++){
            arr[0] = 0;
            arr[i] = Integer.parseInt(st.nextToken()) + arr[i-1];
        }
        for(int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine()," ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            sb.append(arr[b] - arr[a-1]).append("\n");
        }
        System.out.println(sb);
    }
}
/*
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N+1];
        st = new StringTokenizer(br.readLine()," ");
        for (int i=1; i<=N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        for (int i=1; i<=M; i++) {
        st = new StringTokenizer(br.readLine()," ");
            int sum=0;
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            for (int j=a; j<=b; j++) {
                sum += arr[j];
            }
            System.out.println(sum);
        }*/

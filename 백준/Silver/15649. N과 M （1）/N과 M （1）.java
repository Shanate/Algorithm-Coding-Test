
import java.io.*;
import java.util.*;

public class Main {
    static int N, M;
    static int[] a;
    static int[] b;
    static boolean[] v; // visited

    static void perm(int cnt) {
        if(cnt == M){
            StringBuilder sb = new StringBuilder();
            for (int j : b) {
                sb.append(j).append(" ");
            }
            System.out.println(sb.toString().trim());
            return;
        }
        for(int i=1; i<=N; i++){
            if(v[i]) continue;
            v[i] = true;
            b[cnt] = a[i];
            perm(cnt+1);
            v[i] = false;
        }
    }
    public static void main(String[] args) throws Exception {
        // 순서가 상관있나? => 순열이다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        a = new int[N+1];
        b = new int[M];
        v = new boolean[N+1];
        for(int i=1; i<=N; i++){
            a[i] = i;
        }
        perm(0);
    }
}
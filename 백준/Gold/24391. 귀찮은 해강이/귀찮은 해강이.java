
import java.io.*;
import java.util.*;

public class Main {

    static int N,M;
    static int[] parents;
    static int[] LT; // lecture table
    static int find(int a) {
        if (parents[a] == a) return a;
        return parents[a] = find(parents[a]);
    }
    static boolean union(int a, int b) {
        int aRoot = find(a);
        int bRoot = find(b);
        if(aRoot==bRoot) return false;
        parents[bRoot] = aRoot;
        return true;
    }


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        parents = new int[N+1];
        for(int i=0; i<=N; i++){ // make set
            parents[i]=i;
        }
        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine(), " ");
            int I = Integer.parseInt(st.nextToken());
            int J = Integer.parseInt(st.nextToken());
            union(I, J);
        }
        LT = new int[N];
        st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<N; i++){
            LT[i] = Integer.parseInt(st.nextToken());
        }

        int cnt = 0;
        for(int i=0; i<N-1;i++){
            int a = LT[i];
            int b = LT[i+1];

            int r1 = find(a);
            int r2 = find(b);

            if(r1 != r2) cnt++;
        }
        System.out.println(cnt);
    }
}

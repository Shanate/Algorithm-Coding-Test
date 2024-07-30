import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] X = new int[N];
            st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<N; i++){
            X[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(X);
        int cut = X[N-1-K+1];
        System.out.println(cut);
    }
}
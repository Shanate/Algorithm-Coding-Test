import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum=0;
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<5; i++){
            int N = Integer.parseInt(st.nextToken());
            sum += N*N;
        }
        int ans = sum%10;
        System.out.println(ans);
    }
}

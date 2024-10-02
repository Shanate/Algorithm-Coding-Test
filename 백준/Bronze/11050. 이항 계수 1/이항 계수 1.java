import java.io.*;
import java.util.*;

public class Main {

    static int fact(int n) {
        if (n == 1 || n == 0){
            return 1;
        } else {
            return n * fact(n-1);
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int ans = fact(n)/(fact(k)*fact(n-k));
        System.out.println(ans);
    }
}

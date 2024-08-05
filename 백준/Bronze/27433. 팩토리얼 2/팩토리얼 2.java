import java.io.*;
import java.util.*;
public class Main {
    static long fac(int n) {
        if (n ==0 || n == 1) {
            return 1;
        }
        return n*fac(n-1);
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        long result = fac(N);

        System.out.println(result);
    }
}
import java.io.*;
import java.util.*;

public class Main{

    static int m;
    static int n;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());

        isPrime(n);
    }

    static void isPrime(int num) {
        boolean[] Prime = new boolean[num + 1];
        Arrays.fill(Prime, true);
        Prime[0] = Prime[1] = false;

        for (int i = 2; i*i <= num; i++) {
            if (Prime[i]) {
                for (int j = i * i; j<=num && j>0; j += i) {
                    Prime[j] = false;
                }
            }
        }

        m = Math.max(m, 2);

        StringBuilder sb = new StringBuilder();
        for (int i = m; i <= num; i++) {
            if (Prime[i]) {
                sb.append(i).append("\n");
            }
        }
        System.out.println(sb.toString().trim());
    }
}

import java.io.*;
import java.util.*;

public class Main{

    static int cnt;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        cnt = 0;
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(st.nextToken());

            isPrime(a);
        }
            System.out.println(cnt);
    }

    static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        cnt++;
        return true;
    }
}

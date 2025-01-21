import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] son = new int[2];
        int[] mom = new int[2];

        for (int i = 0; i < 2; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            son[i] = Integer.parseInt(st.nextToken());
            mom[i] = Integer.parseInt(st.nextToken());
        }

        int up = son[0] * mom[1] + son[1] * mom[0];
        int down = mom[0] * mom[1];

        int mod = gcd(up, down);
        System.out.println(up/mod + " " + down/mod);
    }

    static int gcd(int a, int b) {
        if (a % b == 0) {
            return b;
        }
        return gcd(b, a % b);
    }
}

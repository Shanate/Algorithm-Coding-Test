import java.io.*;
import java.util.*;

public class Main{

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int cnt = 1;

        while (b > a) {
            if (b % 2 == 0) {
                b /= 2;
            } else if (b%10 == 1) {
                b /= 10;
            } else {
                cnt = -1;
                break;
            }
            cnt++;
        }
        if (b != a) {
            System.out.println(-1);
        } else {
            System.out.println(cnt);
        }
    }
}

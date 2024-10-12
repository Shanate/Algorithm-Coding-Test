import java.io.*;
import java.util.*;

public class Main {
    // 동쪽 다리의 갯수 중 서쪽 다리의 갯수만큼 택해서 다리를 잇는다.
    // 조합
    static int n;
    static int m;
    static int cnt;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());

            int result = bridge(m, n);
            System.out.println(result);
        }
    }

    static int bridge(int m, int n) {
        // mCn = m! / (n!(m-n)!)
        int result = 1;
        for (int i = 0; i < n; i++) {
            result *= m - i;    // 분자 m * (m-1) * ... * (m-n+1)
            result /= i + 1;    // 분모 1 * 2 * 3 * ... * n
        }
        return result;
    }
}

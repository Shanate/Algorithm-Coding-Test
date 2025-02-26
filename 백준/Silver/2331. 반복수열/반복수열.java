import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int A = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        HashMap<Integer, Integer> map = new HashMap<>();

        int cnt = 0;
        int current = A;

        while (!map.containsKey(current)) {
            map.put(current, cnt);
            current = nextNum(current, P);
            cnt++;
        }
        System.out.println(map.get(current));
    }

    static int nextNum(int current, int p) {
        int sum = 0;
        while (current > 0) {
            sum += Math.pow(current % 10, p);
            current /= 10;
        }
        return sum;
    }
}

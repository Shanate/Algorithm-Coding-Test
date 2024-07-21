import java.io.*;
import java.math.*;
import java.util.*;
public class Main {
    private static void hanoi(int n, int from, int mid, int to) {
        if(n==0) return;
        hanoi(n-1, from, to, mid);
        System.out.println(from + " " + to);
        hanoi(n-1, mid, from, to);
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        BigInteger moves = new BigInteger("2").pow(N).subtract(BigInteger.ONE); // 2^N - 1
        System.out.println(moves);
        if (N <= 20) {  // N이 20 이하인 경우에만 이동 과정을 출력
            hanoi(N, 1, 2, 3);
        }
    }
}

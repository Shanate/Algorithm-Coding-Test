import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());
        long C = Long.parseLong(st.nextToken());

        System.out.println(modular(A, B, C));
    }

    // A^B % C를 분할정복으로 계산
    static long modular(long A, long B, long C) {
        if (B == 0) return 1; // A^0 = 1
        long half = modular(A, B / 2, C) % C;
        if (B % 2 == 0) {
            // B가 짝수인 경우
            return (half * half) % C;
        } else {
            // B가 홀수인 경우
            return (half * half % C) * (A % C) % C;
        }
    }
}
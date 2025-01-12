import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        // 첫 번째 패턴: 별 증가
        for (int i = 1; i <= N; i++) {
            // 왼쪽 별
            for (int j = 1; j <= i; j++) {
                sb.append("*");
            }
            // 가운데 공백
            for (int j = 1; j <= 2 * (N - i); j++) {
                sb.append(" ");
            }
            // 오른쪽 별
            for (int j = 1; j <= i; j++) {
                sb.append("*");
            }
            sb.append("\n");
        }

        // 두 번째 패턴: 별 감소
        for (int i = N - 1; i >= 1; i--) {
            // 왼쪽 별
            for (int j = 1; j <= i; j++) {
                sb.append("*");
            }
            // 가운데 공백
            for (int j = 1; j <= 2 * (N - i); j++) {
                sb.append(" ");
            }
            // 오른쪽 별
            for (int j = 1; j <= i; j++) {
                sb.append("*");
            }
            sb.append("\n");
        }

        System.out.print(sb.toString());
    }
}
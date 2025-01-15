import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        // 줄별로 출력
        for (int i = 1; i <= N; i++) {
            // 공백 출력
            for (int j = 1; j <= N - i; j++) {
                sb.append(" ");
            }
            // 별과 공백 출력
            for (int j = 1; j <= i; j++) {
                sb.append("*");
                if (j != i) {
                    sb.append(" "); // 별 사이에 공백 추가
                }
            }
            // 줄바꿈
            sb.append("\n");
        }

        // 출력
        System.out.print(sb.toString());
    }
}
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine()); // 4
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine()); // 각 테스트 케이스의 시작 숫자
            int max = n;

            // 헤일스톤 수열을 반복하여 최대값 찾기
            while (n != 1) {
                if (n % 2 == 0) {
                    n = n / 2;
                } else {
                    n = n * 3 + 1;
                }
                max = Math.max(max, n); // 최대값 갱신
            }
            sb.append(max).append("\n"); // 결과를 StringBuilder에 저장
        }

        System.out.print(sb.toString()); // 결과 출력
    }
}
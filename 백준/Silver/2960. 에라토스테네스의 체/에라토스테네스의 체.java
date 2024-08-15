import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력받은 값을 공백 기준으로 나누어 N과 K에 각각 할당
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]); // 2부터 N까지의 숫자
        int K = Integer.parseInt(input[1]); // K번째로 지워지는 수

        boolean[] isPrime = new boolean[N + 1]; // 숫자가 지워졌는지 확인하기 위한 배열
        int count = 0; // 지워진 수의 카운트

        // 제곱근 범위 내에서 처리
        for (int i = 2; i <= Math.sqrt(N); i++) { // i의 범위를 제곱근까지 제한
            if (!isPrime[i]) { // 아직 지워지지 않은 숫자라면
                for (int j = i; j <= N; j += i) { // i의 배수를 찾아서 지움
                    if (!isPrime[j]) {
                        isPrime[j] = true; // 숫자 j를 지움
                        count++; // 지워진 숫자 카운트 증가

                        if (count == K) { // K번째로 지워지는 숫자라면 출력 후 종료
                            System.out.println(j);
                            return;
                        }
                    }
                }
            }
        }

        // 제곱근 이후의 소수들에 대해 처리
        for (int i = (int)Math.sqrt(N) + 1; i <= N; i++) {
            if (!isPrime[i]) {
                for (int j = i; j <= N; j += i) {
                    if (!isPrime[j]) {
                        isPrime[j] = true;
                        count++;

                        if (count == K) {
                            System.out.println(j);
                            return;
                        }
                    }
                }
            }
        }
    }
}
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 두 수를 공백을 기준으로 입력 받음
        String[] input = br.readLine().split(" ");

        // 첫 번째 수와 두 번째 수를 역순으로 변환
        int N = reverseNumber(input[0]);
        int M = reverseNumber(input[1]);

        // 더 큰 수 출력
        System.out.println(Math.max(N, M));
    }

    // 숫자를 역순으로 변환하는 메서드
    public static int reverseNumber(String num) {
        StringBuilder sb = new StringBuilder(num);
        return Integer.parseInt(sb.reverse().toString());
    }
}

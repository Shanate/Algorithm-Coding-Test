import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        //  초항
        long seqNum = Integer.parseInt(br.readLine());

        int cnt = 0;

        while (cnt < Integer.MAX_VALUE) {
            // 횟수 증가
            cnt++;
            // C(n)이 처음으로 1이 되면 종료
            if (seqNum == 1) {
                break;
            }
            // 3*C(n)+1 (C(n)이 홀수일 때)
            if (seqNum % 2 == 1) {
                seqNum = seqNum * 3 + 1;
            }
            // C(n)/2 (C(n)이 짝수일 때)
            else {
                seqNum = seqNum / 2;
            }
        }

        // 출력
        System.out.print(cnt);
    }
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    // BufferedReader Object 생성
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        // 출력
        System.out.print(new StringTokenizer(br.readLine(), ",").countTokens());
    }
}
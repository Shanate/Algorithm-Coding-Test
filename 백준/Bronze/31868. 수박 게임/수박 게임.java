import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {
        // 1단계 과일은 체리 N단계 과일은 수박
        // i단계 과일 2개를 소모하면 i+1단계 과일 1개를 만들 수 있다.
        // k개의 체리로 최대 몇 개의 수박을 만들 수 있나?

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int waterCount = 1;
        int answer = 0;

        // 체리는 1단계부터 시작하니까 N-1한다.
        // 수박 1개에 필요한 체리의 개수를 구한ㄷ.
        for (int i = 1; i < N; i++) {
            waterCount *= 2;
        }

        // 위의 for문은 Math.pow를 사용해 간단하게 나타낼 수 있다.
       // waterCount = (int)Math.pow(2, N-1);

        // K개에서 계속 수박 만들 때 필요한 체리 개수를 빼준다
        while (K >= waterCount){
            K -= waterCount;
            answer++;
        }

        System.out.println(answer);
    }
}
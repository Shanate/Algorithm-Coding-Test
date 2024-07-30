import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int N = Integer.parseInt(br.readLine());
        int[] count = new int[10001];  // 문제에서 숫자의 범위가 1부터 10000까지라고 명시되어 있습니다.
        for (int i = 0; i < N; i++) {
            count[Integer.parseInt(br.readLine())]++;
        }
        for (int i = 1; i <= 10000; i++) {
            while (count[i] > 0) {
                sb.append(i).append("\n");
                count[i]--;
            }
        }
        System.out.print(sb.toString());
        br.close();
    }
}

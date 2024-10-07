import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        for (int i = 1; i <= n; i++) {
            // 공백 출력: n - i 개 만큼 출력
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            
            // 별 출력: 2 * i - 1 개 만큼 출력
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            
            // 줄바꿈
            System.out.println();
        }
    }
}

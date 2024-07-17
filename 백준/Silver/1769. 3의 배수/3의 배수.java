import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine();
        int cnt = 0;
        int sum = 0;
        while (N.length() > 1) {
            sum = 0;
            for (int i = 0; i < N.length(); i++) {
                sum += N.charAt(i) - '0';
            }
            N = String.valueOf(sum);
            cnt++;
        }
        sum = Integer.parseInt(N);
        String ans = (sum % 3 == 0) ? "YES" : "NO";
        System.out.println(cnt);
        System.out.println(ans);
    }
}
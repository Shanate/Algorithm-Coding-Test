import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        int n = Integer.parseInt(br.readLine());

        for(int i=1; i<=n; i++){
            st = new StringTokenizer(br.readLine()," ");
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            int C = A+B;
            System.out.println("Case #" +i + ": " + A + " + " + B + " = " + C);
        }
    }
}

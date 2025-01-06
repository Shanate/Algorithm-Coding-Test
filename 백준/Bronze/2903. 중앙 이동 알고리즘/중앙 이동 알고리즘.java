import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int length = 2;
        for (int i = 1; i <= N; i++) {
            length = length + (length - 1);
        }
        int ans = length * length;
        System.out.println(ans);

    }
}

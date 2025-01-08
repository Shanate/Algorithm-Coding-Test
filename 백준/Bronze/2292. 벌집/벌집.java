import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int cnt = 1;
        int seq = 1;

        while(n > seq) {
            seq += cnt * 6;
            cnt++;
        }
        System.out.println(cnt);

    }
}

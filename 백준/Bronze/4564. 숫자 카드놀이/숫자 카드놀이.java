import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            int n = Integer.parseInt(br.readLine());
            if(n == 0) break;

            StringBuilder sb = new StringBuilder();
            sb.append(n);

            while(n >= 10){
                int next = 1;
                while(n>0){
                    next *= (n%10);
                    n /= 10;
                }
                n = next;
                sb.append(" ").append(n);
            }
            System.out.println(sb.toString());
        }
    }
}

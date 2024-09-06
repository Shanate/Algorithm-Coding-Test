import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        String N = st.nextToken();
        int D = Integer.parseInt(st.nextToken());
        int tmp = 1;
        int sum = 0;

        for(int i=N.length()-1; i >= 0; i--){ 
            char c = N.charAt(i);
            
            if ('A' <= c && c<= 'Z') {
                sum += (c - 'A' + 10) * tmp;
            } else {
                sum += (c - '0') * tmp;
            }
            tmp *= D;
        }

        System.out.println(sum);
    }
}
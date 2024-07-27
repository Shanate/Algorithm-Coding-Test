import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        int N = Integer.parseInt(br.readLine());
        int sum=0;
        String s = br.readLine();
        for(int i=0; i<N; i++){
            sum += s.charAt(i)-'0';
        }
        System.out.println(sum);
    }
}
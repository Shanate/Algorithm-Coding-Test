import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int Max;

        if(A!=B && B!=C && A!=C){
            Max = Math.max(A, Math.max(B, C));
            System.out.println(Max*100);
        } else if (A == B && A == C){
            System.out.println(A*1000 + 10000);
        } else if (A == B || A == C){
            System.out.println(A*100 + 1000);
        } else {
            System.out.println(B*100 + 1000);
        }
    }
}

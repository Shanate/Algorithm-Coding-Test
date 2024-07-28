import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[10];
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        String S = String.valueOf(A*B*C);
        for(int i=0; i<S.length(); i++){
            arr[(S.charAt(i)-48)]++;
        }
        for(int ans : arr){
            System.out.println(ans);
        }
    }
}

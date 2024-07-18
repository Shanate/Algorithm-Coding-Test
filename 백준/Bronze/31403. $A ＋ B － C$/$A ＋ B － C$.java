import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        System.out.println(A+B-C);
        String abStr = Integer.toString(A) + Integer.toString(B);
        int AB = Integer.parseInt(abStr);
        System.out.println(AB-C);
    }
}
import java.io.*;
import java.util.*;
public class Main {
    static int n;
    static int factorial;

    static int fact(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        else {

            return factorial = n * fact(n-1);
        }
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        int result = fact(n);
        System.out.println(result);
    }
}
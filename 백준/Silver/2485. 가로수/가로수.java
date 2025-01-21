import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int gcd  = 0;

        for(int i = 0 ; i < N-1 ; i++){
            int term = arr[i+1] - arr[i];
            gcd = GCD(term, gcd);
        }
        System.out.println((arr[N-1]-arr[0])/gcd+1-(arr.length));
    }

    static int GCD(int a, int b) {
        while(b != 0){
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}

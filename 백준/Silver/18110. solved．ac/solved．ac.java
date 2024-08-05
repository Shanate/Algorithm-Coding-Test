import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long tm = Math.round(  N  * 0.15 );
        int[] score = new int[N];
        int sum = 0;
        int avg = 0;
        for(int i=0; i<N; i++){
            score[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(score);
        for(long i=tm; i<N-tm; i++){
            sum += score[(int) i];
        }
            avg = Math.round((float) sum/(N-(2*tm)));
//        System.out.println(sum);
        System.out.println(avg);
    }
}
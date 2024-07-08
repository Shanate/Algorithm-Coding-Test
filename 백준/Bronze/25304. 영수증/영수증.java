import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        int X = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        int Sum = 0;
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            Sum += a*b;
        }
        if(Sum != X){
            System.out.println("No");
            return;
        }
        System.out.println("Yes");
    }
}
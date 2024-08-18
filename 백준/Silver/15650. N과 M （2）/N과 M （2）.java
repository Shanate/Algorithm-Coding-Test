import java.io.*;
import java.util.*;

public class Main {

        static int n;
        static int m; // m = count
        static int[] selected;

    static void comb(int start, int depth) {
        if(depth==m){
            for(int i=0; i<m; i++){
                System.out.print(selected[i]+" ");
            }
            System.out.println();
            return;
        }
        for(int i = start; i <= n; i++){
            selected[depth] = i;
            comb(i+1, depth+1);
        }
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        selected = new int[m];

        comb(1, 0);   // 3 1

    }
}


import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] chess = new int[6];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<6; i++) {
            int N = Integer.parseInt(st.nextToken());
            chess[i] = N; // 배열에 입력
            if(i==0 || i==1){
                chess[i] = 1-chess[i];
            } else if (i==2 || i==3 || i==4){
                chess[i] = 2-chess[i];
            } else {
                chess[i] = 8 - chess[i];
            }
        }
        for(int i=0; i<6; i++){
            System.out.print(chess[i] +" ");
        }
    }
}

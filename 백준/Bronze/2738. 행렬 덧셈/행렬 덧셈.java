import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] matrixA = new int[N][M];
        int[][] matrixB = new int[N][M];
        int[][] result  = new int[N][M];

        for (int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<M; j++){
                matrixA[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for (int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<M; j++){
                matrixB[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i=0; i<N; i++){
            for (int j=0; j<M; j++){
                result[i][j] = matrixA[i][j]+matrixB[i][j];
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}

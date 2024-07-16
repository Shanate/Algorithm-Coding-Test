import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken()); // N x M
        int[][] matrix = new int[N][M];
        for(int i=0; i<N; i++){
        st = new StringTokenizer(br.readLine(), " ");
            for(int j=0; j<M; j++){
                matrix[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int K = Integer.parseInt(br.readLine());
        int[] sum = new int[K]; // 배열의 합을 저장할 매트릭스
        Arrays.fill(sum, 0);

        for(int turn=0; turn<K; turn++){
        st = new StringTokenizer(br.readLine(), " ");
            int i = Integer.parseInt(st.nextToken())-1;
            int j = Integer.parseInt(st.nextToken())-1;
            int x = Integer.parseInt(st.nextToken())-1;
            int y = Integer.parseInt(st.nextToken())-1; // 편의성
            for(int a=i; a<=x; a++){
                for(int b=j; b<=y; b++){
                    sum[turn] += matrix[a][b];
                }
            }
            System.out.println(sum[turn]);
        }
    }
}
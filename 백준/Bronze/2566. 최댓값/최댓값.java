import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        int max = 0;
        int x = 0, y = 0;

        int[][] matrix = new int[10][10]; // 0행과 0열은 사용X 가독성.

        for (int i=1; i<=9; i++){
            st = new StringTokenizer(br.readLine()," ");
            for(int j=1; j<=9; j++){
                matrix[i][j] = Integer.parseInt(st.nextToken());
                if(max<matrix[i][j]){
                    max = matrix[i][j];
                    x = i; y = j;
                } else if(max == 0){
                    x= 1; y =1;
                }
            }
        }
        System.out.println(max + "\n" + x +" " + y);
//        System.out.println(Arrays.deepToString(matrix));
    }
}
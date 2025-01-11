import java.io.*;
import java.util.*;

public class Main {

    static int N;
    static int[][] map;
    static int blue;
    static int white;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        map = new int[N][N];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            } // j for
        } // i for
        divide(N, 0, 0);

        System.out.println(white);
        System.out.println(blue);

    } // main

    static void divide(int size, int row, int col) {
        if(check(size, row, col)){
            if(map[row][col] == 0){
                white++;
            }
            else {
                blue++;
            }
            return;
        }
        int newSize = size / 2;
        divide(newSize, row, col);						// 2사분면
        divide(newSize, row, col + newSize);				// 1사분면
        divide(newSize, row + newSize, col);                // 3사분면
        divide(newSize, row + newSize, col + newSize);    // 4사분면
    }

    static boolean check(int size, int row, int col) {
        int color = map[row][col];

        for (int i = row; i < row + size; i++) {
            for(int j = col; j < col + size; j++) {
                if(map[i][j] != color){
                    return false;
                }
            }
        }
        return true;
    }
} // class

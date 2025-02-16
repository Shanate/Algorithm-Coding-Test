import java.io.*;
import java.util.*;

public class Main {

    static int n;
    static int[][] map;
    static int cnt_zero = 0;
    static int cnt_minusOne = 0;
    static int cnt_plusOne = 0;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        map = new int[n][n];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < n; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        divide(0, 0, n);

        System.out.println(cnt_minusOne);
        System.out.println(cnt_zero);
        System.out.println(cnt_plusOne);

    }

//        System.out.println(Arrays.deepToString(map));


    static void divide(int row, int col, int size) {
        if (check(row, col, size)) {
            if (map[row][col] == -1) {
                cnt_minusOne++;
            } else if (map[row][col] == 0) {
                cnt_zero++;
            } else if (map[row][col] == 1) {
                cnt_plusOne++;
            }
            return;
        }

        int newSize = size / 3;
        // 9분할
        divide(row, col, newSize); // 1
        divide(row, col + newSize, newSize); // 2
        divide(row, col + 2 * newSize, newSize); // 3
        divide(row + newSize, col, newSize); // 4
        divide(row + newSize, col + newSize, newSize); // 5
        divide(row + newSize, col + 2 * newSize, newSize); // 6
        divide(row + 2 * newSize, col, newSize); // 7
        divide(row + 2 * newSize, col + newSize, newSize); // 8
        divide(row + 2 * newSize, col + 2 * newSize, newSize); // 9
    }

    static boolean check(int row, int col, int size) {
        int num = map[row][col];

        for (int i = row; i < row + size; i++) {
            for (int j = col; j < col + size; j++) {
                if (num != map[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}



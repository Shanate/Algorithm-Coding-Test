import java.util.Scanner;
import java.io.FileInputStream;

class Solution {

    static int[] di = { 0, 1, 0, -1};
    static int[] dj = {1, 0, -1, 0};

    public static void main(String args[]) throws Exception
    {

        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();

        for(int test_case = 1; test_case <= T; test_case++)
        {
            int N = sc.nextInt();
            int[][] nums = new int[N][N];
            int number = N * N;

            int dir = 0;
            int i = 0;
            int j = 0;

            for (int k = 1; k <= number; k++) {
                nums[i][j] = k;
                if (i + di[dir] >= N || i + di[dir] < 0 || j + dj[dir] >= N || j + dj[dir] < 0 || nums[i + di[dir]][j + dj[dir]] != 0) {
                    dir = (dir + 1) % 4;
                }
                i += di[dir];
                j += dj[dir];
            }
            System.out.println("#" + test_case);
            for (int k = 0; k < N; k++) {
                for (int n : nums[k])
                    System.out.print(n + " ");
                    System.out.println();

            }
        }
    }
}

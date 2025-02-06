import java.io.*;
import java.util.*;

public class Main {

    public static int n;
    public static int[] arr;
    public static int Max = Integer.MIN_VALUE;
    public static int[] newArr;
    public static boolean[] visited;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        arr = new int[n];
        newArr = new int[n];
        visited = new boolean[n];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {

            arr[i] = Integer.parseInt(st.nextToken());
        }
        back(0);
        System.out.println(Max);

    }

    private static void back(int depth) {
        if (depth == n) {
            int sum = 0;
            for (int i = 0; i < n - 1; i++) {

                sum += Math.abs(newArr[i] - newArr[i + 1]);
            }
            Max = Math.max(Max, sum);
            return;
        }
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                visited[i] = true;
                newArr[depth] = arr[i];
                back(depth + 1);
                visited[i] = false;
            }
        }
    }
}

import java.io.*;
import java.util.*;

public class Main {

    static int N;
    static int[] arr;
    static boolean[] visited;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            N = Integer.parseInt(br.readLine());
            arr = new int[N + 1];
            visited = new boolean[N + 1];
            int cnt = 0;

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 1; i <= N; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
            for (int i = 1; i <= N; i++) {
                if (visited[i] == false) {
                    dfs(i);
                    cnt++;
                }
            }

            System.out.println(cnt);
        } // while
    }

    static void dfs(int start) {
        visited[start] = true;
        int next = arr[start];
        if (visited[next] == false) {
            dfs(next);
        }
    }
}

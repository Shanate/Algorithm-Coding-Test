import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int a = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        bfs(a, k);
        System.out.println(bfs(a, k));


    }

    static int bfs(int a, int k) {
        ArrayDeque<int[]> q = new ArrayDeque<>();
        boolean[] visited = new boolean[k+1];

        q.add(new int[]{a,0}); // 현재 숫자, 연산 횟수
        visited[a] = true;

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int num = cur[0];
            int cnt = cur[1];

            // 현재 숫자가 k에 도달하면 횟수를 반환
            if (num == k) {
                return cnt;
            }

            int add = num + 1;
            int mul = num * 2;

            if(add <= k && !visited[add]) {
                q.add(new int[]{add, cnt + 1});
                visited[add] = true;
            }
            if(mul <= k && !visited[mul]) {
                q.add(new int[]{mul, cnt + 1});
                visited[mul] = true;
            }
        }
        return -1;
    }
}
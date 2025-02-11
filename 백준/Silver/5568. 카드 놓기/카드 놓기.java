import java.io.*;
import java.util.*;

public class Main {

    static int n, k;
    static String[] cards;
    static boolean[] visited;
    static HashSet<String> set = new HashSet<>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        k = Integer.parseInt(br.readLine());
        cards = new String[n];
        visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            cards[i] = br.readLine();
        }

        dfs("", 0);
        System.out.println(set.size());
    }

    static void dfs(String cur, int depth) {
        if (depth == k) {
            set.add(cur);
            return;
        }
        for (int i = 0; i < n; i++) {
            if(!visited[i]) {
                visited[i] = true; // 방문 처리
                dfs(cur + cards[i], depth + 1);
                visited[i] = false; // 끝나면 방문 해제
            }
        }
    }
}

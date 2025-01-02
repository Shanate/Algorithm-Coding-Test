import java.io.*;
import java.util.*;
/*
무방향 그래프를 사용하며, 배웠던 dfs를 활용한다.
*/

public class Main {

    static int arr[][];
    static boolean node[];
    static int cnt;
    static int n, m;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[n+1][n+1];
        node = new boolean[n+1];

        for(int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine(), " ");
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            arr[u][v] = 1;
            arr[v][u] = 1;
        }

        cnt = 0;
        for(int i=1; i<=n; i++){
            if(node[i] == false) {
                dfs(i);
                cnt++;
            }
        }
        System.out.println(cnt);

    }

    static void dfs(int i) {

        if(node[i] == true){
            return;
        }

        node[i] = true;
        for(int j=1; j<=n; j++){
            if(arr[i][j] == 1){
                dfs(j);
            }
        }

    }
}

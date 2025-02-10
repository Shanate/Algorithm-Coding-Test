import java.io.*;
import java.util.*;

public class Main {

    static boolean[][] visited;
    static int[] select = new int[3];
    static int n, m;
    static int answer = 0;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        visited = new boolean[n + 1][n + 1];
        for (int i = 0; i < m; i++) {

            st = new StringTokenizer(br.readLine(), " ");
            int n1 = Integer.parseInt(st.nextToken());
            int n2 = Integer.parseInt(st.nextToken());

            visited[n1][n2] = true;
            visited[n2][n1] = true;
        }
        //아이스크림 모든 조합 만들기
        for (int i = 1; i <= n; i++) {

            select[0] = i;
            search(1, i);
        }
        System.out.println(answer);  // 결과 출력
    }

    static void search(int depth, int index){
        if(depth==3){
            selectCheck();
            return;
        }
        //탐색
        for (int i = index + 1; i <= n; i++) {

            select[depth] = i;
            search(depth + 1, i);
        }
    }
    static void selectCheck(){
        for (int i = 0; i < 3; i++) {

            for (int j = i + 1; j < 3; j++) {

                if (visited[select[i]][select[j]]) {

                    return;
                }
            }
        }
        answer++;
    }
}
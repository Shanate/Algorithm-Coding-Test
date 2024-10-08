import java.io.*;
import java.util.*;

public class Main {

    static boolean[][] chess;
    static int min = 64;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        chess = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            String color = br.readLine();

            for (int j = 0; j < m; j++) {
                if(color.charAt(j) == 'W'){
                    chess[i][j] = true;
                } else if (color.charAt(j) == 'B'){
                    chess[i][j] = false;
                }
            }
        }
        int search_N = n-7;
        int search_M = m-7;

        for(int i = 0; i < search_N; i++){
            for(int j = 0; j < search_M; j++){
                find(i, j);
            }
        }
        System.out.println(min);
    }

    private static void find(int x, int y) {
        int end_x = x+8;
        int end_y = y+8;
        int cnt = 0;

        boolean TF = chess[x][y]; // 첫번째 칸의 색

        for(int i = x; i < end_x; i++){
            for(int j = y; j < end_y; j++){
                if(chess[i][j] != TF){ // 내가 가리키고 있는 칸과 있어야할 색이 일치하지 않는다면 카운트 증가
                    cnt++;
                }
                TF = (!TF); // 다음 칸은 현재 색과 반대
            }
            TF = (!TF); // 다음 줄의 칸은 현재 줄의 첫번째 칸과 달라야 한다. 그래서 한 번 더 뒤집어준다.
        }

        cnt = Math.min(cnt, 64 - cnt); // 첫 번째 칸 기준에서의 cnt와 첫 번째 칸의 반대되는 색을 기준했을 때의 cnt
                                    // 예로 첫 번째 칸이 W이고 cnt가 20이라 했을 때,
                                    // W로 유지하는 경우 20칸, B로 바꿨을 경우 64-20=44로 수정해야 함.
        min = Math.min(min, cnt); // 지금까지 탐색했던 체스판 중에서의 최솟값을 결정.

    }
}

import java.io.*;
import java.util.*;

public class Main{

    static int[][] map = new int[5][5];
    static int[] di = new int[]{-1, 0, 1, 0};
    static int[] dj = new int[]{0, 1, 0, -1};
    static HashSet<String> set = new HashSet<>();
//    static boolean[][] visited = new boolean[5][5]; // 중복을 허용하기 때문에 HashSet으로 체크를 하자. 방문 배열은 필요가 없다.
//    static int cnt = 0;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < 5; j++) {
                int digit = Integer.parseInt(st.nextToken());
                map[i][j] = digit;
            }
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                back(i, j, 0, String.valueOf(map[i][j]));
            }
        }
        // x 위치, y 위치, 깊이, 카운트
        System.out.println(set.size());
//        System.out.println(Arrays.deepToString(map));
    }

    static void back(int row, int col, int depth, String number) {
        if(depth == 5){
            set.add(number);
            return;
        }

        for (int k = 0; k < 4; k++) {
            int curX = row + di[k];
            int curY = col + dj[k];
            if(0 <= curX && curX < 5 && 0 <= curY && curY < 5){
                back(curX, curY, depth + 1, number + map[curX][curY]);
            }
        }

    }
}

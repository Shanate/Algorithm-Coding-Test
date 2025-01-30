import java.io.*;
import java.util.*;

public class Main{

    static int n, m, b;
    static int[][] map;
    static int max = Integer.MIN_VALUE;
    static int min = Integer.MAX_VALUE;
    static int time = Integer.MAX_VALUE;
    static int height = 0;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());

        map = new int[n][m];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < m; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                max = Math.max(max, map[i][j]); // 현재 주어진 높이의 최대치
                min = Math.min(min, map[i][j]); // 현재 주어진 높이의 최저치
            }
        }
        for (int k = max; k >= min; k--) {
            // 완전탐색 방식으로, for 문이 다 돌아갔을 때, tcnt와 block을 초기화한다.
            // 최대치 높이부터 내려온다.
            int tcnt = 0;
            int block = b;

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (map[i][j] > k) { // 블록의 높이가 원하는 층수보다 높으면
                        block += map[i][j] - k; // 원하는 층수만큼을 빼서 인벤토리에 저장한다.
                        tcnt += (map[i][j] - k) * 2; // 시간은 2초가 소요된다.
                    } else if (map[i][j] < k) { // 블록의 높이가 원하는 층수보다 낮으면
                        block -= k - map[i][j]; // 원하는 층수만큼 더하고 인벤토리에서 뺀다.
                        tcnt += k - map[i][j]; // 시간은 1초가 소요된다.
                    }
                }
            }

            if (block >= 0 && time > tcnt) { // 인벤토리에 남은 블록이 음수가 아니고, 카운팅한 시간이 더 적은 경우
                // 역순 완전탐색이기 때문에 같은 시간일 경우는 고려하지 않게 한다.
                // 시간이 동일할 경우 높은 층수를 우선시할 수 있게 역순으로 만들었기 때문이다.
                height = k; // 최신화한다.
                time = tcnt;
            }
        }
        System.out.println(time + " " + height);
    }
}

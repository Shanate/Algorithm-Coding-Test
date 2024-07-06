
import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        int[][] bingo = new int[6][6]; // Using (1,1)~(5,5), Not (0,0)~(4,4)
        boolean[][] visited = new boolean[6][6]; // 숫자가 같으면 True로 switch on
        int check;
        int cnt = 0;
        boolean bingoComplete = false;
        for (int i = 1; i <= 5; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 1; j <= 5; j++) {
                bingo[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for (int i = 1; i <= 5 && !bingoComplete; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 1; j <= 5 && !bingoComplete; j++) {
                check = Integer.parseInt(st.nextToken());
                cnt++;
                for (int x = 1; x <= 5; x++) {
                    for (int y = 1; y <= 5; y++) {
                        if (bingo[x][y] == check) { // 방문 확인
                            visited[x][y] = true;
                        }
                    }
                }
                if (countBingo(visited) >= 3) {
                    bingoComplete = true;
                    System.out.println(cnt);
                }
            }
        }
    }
    // 빙고의 개수를 세는 함수
    static int countBingo(boolean[][] visited) {
        int bingoCount = 0;

        // 가로 체크
        for (int i = 1; i <= 5; i++) {
            boolean isBingo = true;
            for (int j = 1; j <= 5; j++) {
                if (!visited[i][j]) {
                    isBingo = false;
                    break;
                }
            }
            if (isBingo) bingoCount++;
        }
        // 세로 체크
        for (int j = 1; j <= 5; j++) {
            boolean isBingo = true;
            for (int i = 1; i <= 5; i++) {
                if (!visited[i][j]) {
                    isBingo = false;
                    break;
                }
            }
            if (isBingo) bingoCount++;
        }
        // 대각선 체크 (왼쪽 위에서 오른쪽 아래로)
        boolean isBingo = true;
        for (int i = 1; i <= 5; i++) {
            if (!visited[i][i]) {
                isBingo = false;
                break;
            }
        }
        if (isBingo) bingoCount++;
        // 대각선 체크 (오른쪽 위에서 왼쪽 아래로)
        isBingo = true;
        for (int i = 1; i <= 5; i++) {
            if (!visited[i][6 - i]) {
                isBingo = false;
                break;
            }
        }
        if (isBingo) bingoCount++;

        return bingoCount;

    }
}

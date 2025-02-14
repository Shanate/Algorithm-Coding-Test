import java.io.*;
import java.util.*;

/*
1: 익은 토마토, 0: 익지 않은 토마토, -1: 없는 공간
상하가 추가된 탐색이 필요
입력 토마토 상태 저장 -> 익은 토마토(1)를 시작으로 탐색하면서 0을 1로 변경
*/

public class Main {

    static int inputX, inputY, inputZ;
    static int[][][] arr; // 3차원 배열
    static int[] dx = { 0, 0, -1, 1, 0, 0 }; // 상, 하, 좌, 우, 앞, 뒤
    static int[] dy = { 1, -1, 0, 0, 0, 0 };
    static int[] dz = { 0, 0, 0, 0, -1, 1 };
    static Queue<point> queue = new LinkedList<>();

    static class point {
        int x, y, z;

        point(int z, int x, int y) { // 층, 가로, 세로
            this.x = x;
            this.y = y;
            this.z = z;
        }
    }// class point

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        inputY = Integer.parseInt(str[0]); // 가로
        inputX = Integer.parseInt(str[1]); // 세로
        inputZ = Integer.parseInt(str[2]); // 높이

        arr = new int[inputZ][inputX][inputY];

        for (int k = 0; k < inputZ; k++) { // 토마토 상태 저장
            for (int i = 0; i < inputX; i++) {
                String[] str1 = br.readLine().split(" ");
                for (int j = 0; j < inputY; j++) {
                    arr[k][i][j] = Integer.parseInt(str1[j]);
                }
            }
        }

        for (int k = 0; k < inputZ; k++) {
            for (int i = 0; i < inputX; i++) {
                for (int j = 0; j < inputY; j++) {
                    if (arr[k][i][j] == 1) { // 익은 토마토라면
                        queue.add(new point(k, i, j)); // 시작점으로 해서 큐에 삽입

                    }
                }
            }
        }
        bfs();
        checkTomato();

    }// main()

    static void bfs() {
        while (!queue.isEmpty()) {
            point tomatoLocate = queue.poll(); // 현재 토마토 위치
            int tz = tomatoLocate.z;
            int tx = tomatoLocate.x;
            int ty = tomatoLocate.y;

            for (int i = 0; i < 6; i++) { // 탐색
                int nx = tx + dx[i];
                int ny = ty + dy[i];
                int nz = tz + dz[i];

                if (nx >= 0 && ny >= 0 && nz >= 0 && nx < inputX && ny < inputY && nz < inputZ) {
                    if (arr[nz][nx][ny] == 0) { // 익지 않았으면
                        queue.add(new point(nz, nx, ny)); // 큐에 추가하고 다음에 익도록 변경
                        arr[nz][nx][ny] = arr[tz][tx][ty] + 1; // 카운트 +1
                    }
                }

            }

        }
    }// bfs()

    static void checkTomato() {
        int days = 0;

        for (int k = 0; k < inputZ; k++) {
            for (int i = 0; i < inputX; i++) {
                for (int j = 0; j < inputY; j++) {
                    if (arr[k][i][j] == 0) { // 익지 않은 토마토가 있다면
                        System.out.println(-1);
                        return;
                    }
                    days = Math.max(days, arr[k][i][j]); // 최대 날짜 갱신
                }
            }
        }

        if (days == 1)
            System.out.println(0); // 이미 모두 익었다면
        else {
            System.out.println(days - 1); // 최소 날짜를 출력
        }
    }
}

// https://yeons4every.tistory.com/133 참고
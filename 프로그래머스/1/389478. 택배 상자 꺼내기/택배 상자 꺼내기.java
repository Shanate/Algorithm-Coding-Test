import java.util.Arrays;

class Solution {

static int solution(int n, int w, int num) {
        int answer = 0;
        int height = (n / w) + 1; // sol1 -> 4층
        boolean left = true;

        int[][] arr = new int[height][w];
        int cnt = 0;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < w; j++) {
                if (left == true && cnt < n) {
                    arr[i][j] = j + 1;
                    cnt++;
                } // if
                if (left == false && cnt < n) {
                    arr[i][w - j - 1] = j + 1;
                    cnt++;
                }

            } // w for
            left = !left;
        } // i for
//        System.out.println(cnt);
        int curHeight = (num - 1) / w;
        int curPos = (num - 1) % w + 1; // 1부터 w까지 범위 유지

        // 홀수층이면 반대 위치 적용
        if (curHeight % 2 == 1) {
            curPos = w - curPos + 1;
        }

        for (int i = curHeight; i < height; i++) {
            if (arr[i][curPos - 1] != 0) {
                answer++;
            }
        }

        System.out.println(Arrays.deepToString(arr));
        return answer;
    }
}
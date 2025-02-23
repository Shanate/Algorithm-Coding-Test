import java.util.*;
import java.io.FileInputStream;

class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t = 1; t <= T; t++) {
            sc.nextInt();
            int[] scores = new int[101]; // 100점 까지 점수 나온 점수의 개수 저장
            for (int i = 0; i < 1000; i++) { // 1000명의 학생의 점수 입력
                scores[sc.nextInt()]++;
            }
            int max = 0, idx = 0; // 최빈값과 최빈값인 점수 저장 변수
            for (int i = 100; i > 0; i--) { // 큰 점수 부터
                if (scores[i] > max) { // 최빈값 찾기
                    max = scores[i]; // 빈도수 저장
                    idx = i; // 최빈값 점수
                }
            }

            System.out.printf("#%d %d\n", t, idx);
        }
    }
}

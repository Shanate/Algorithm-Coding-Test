import java.util.Scanner;
import java.io.FileInputStream;

class Solution {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();


        for (int test_case = 1; test_case <= T; test_case++) {

            int[] box = new int[T]; // 3개의 박스
            int result = 0;

            for (int i = 0; i < 3; i++) {
                box[i] = sc.nextInt(); // 사탕 집어넣기
            }

            if (box[1] >= 2 && box[2] >= 3) {
                // 최소 사탕 개수  && 이미 완성
                if (box[1] >= box[2]) {
                    result += box[1] - box[2] + 1;
                    box[1] = box[2] - 1;
                }

                if (box[0] >= box[1]) {
                    result += box[0] - box[1] + 1;
                    box[0] = box[1] - 1;
                }
            } else {
                // 불가능한 경우
                result = -1;
            }

            System.out.println("#" + test_case + " " + result);
        }
    }
}
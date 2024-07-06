import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        int N = Integer.parseInt(br.readLine());
        int[] sw = new int[N + 1]; // N개의 스위치, 0 사용 X => +1
        //////////////////// 스위치 배열
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 1; i <= N; i++) {
            sw[i] = Integer.parseInt(st.nextToken());
        }
        /////////////////////// 학생 선정
        int students = Integer.parseInt(br.readLine());
        for (int i = 0; i < students; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int gender = Integer.parseInt(st.nextToken());
            int number = Integer.parseInt(st.nextToken());

            if (gender == 1) { // 남자 : 번호의 배수 스위치는 reverse 시킨다. toggle
                for (int j = 1; j <= N; j++) {
                    if (j % number == 0) {
                        sw[j] = (sw[j] == 0) ? 1 : 0;
                    }
                }
            } else { // 여자 : 번호 좌우 스위치가 대칭이면 reverse 시킨다. toggle
                sw[number] = (sw[number] == 0) ? 1 : 0; // 자기 자신 변경
                for (int j = 1; j <= N / 2; j++) {
                    if (number - j <= 0 || number + j > N) // 범위가 넘어갈 때
                        break;
                    else if (sw[number - j] == sw[number + j]){  // 대칭
                        sw[number - j] = (sw[number - j] == 0) ? 1 : 0;
                        sw[number + j] = (sw[number + j] == 0) ? 1 : 0;
                    } else { // 대칭이 아닐 때
                        break;
                    }
                }
            }
        }
        for (int i = 1; i <= N; i++) {
            System.out.print(sw[i] + " ");
            if (i % 20 == 0)
                System.out.println();
        }
    }
}
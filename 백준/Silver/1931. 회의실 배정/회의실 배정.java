import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        int N = Integer.parseInt(br.readLine());

        int[][] time = new int[N][2];
        int cnt = 0; // 카운팅
        int end = 0; // 종료시간

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            time[i][0] = Integer.parseInt(st.nextToken()); // 시작
            time[i][1] = Integer.parseInt(st.nextToken()); // 종료
        }

        Arrays.sort(time, (o1, o2) -> {
            if(o1[1] == o2[1]) return o1[0] - o2[0]; // 종료 시간 같을 경우 시작 시간 오름차순
            return o1[1] - o2[1];
        });

        for (int i = 0; i < N; i++) {
            if(end <= time[i][0]) { // 직전 종료 시간보다 시작 시간이 뒤에 있는 경우만 고려
                end = time[i][1]; // 현재 종료 시간 바꾸기
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}

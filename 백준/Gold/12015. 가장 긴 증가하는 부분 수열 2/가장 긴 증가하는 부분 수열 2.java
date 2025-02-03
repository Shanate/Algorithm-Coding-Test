import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int[] LIS = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        LIS[0] = arr[0];
        int lenLIS = 1;

        for (int i = 1; i < N; i++) {
            int value = arr[i];

            if(LIS[lenLIS - 1] < value) { // 수열 값이 LIS의 마지막 값 보다 클 경우 추가한다.
                ++lenLIS;
                LIS[lenLIS-1] = value;
            }
            else { // 수열 값이 LIS보다 작을 경우 직전의 가장 큰 값을 대체한다.
                int lo =0;
                int hi = lenLIS;
                while(lo < hi) {
                    int mid = (lo + hi) / 2;

                    if (LIS[mid] < value) {
                        lo = mid + 1;
                    } else {
                        hi = mid;
                    }
                }
                LIS[lo] = value;
            }
        }
        System.out.println(lenLIS);

    }
}

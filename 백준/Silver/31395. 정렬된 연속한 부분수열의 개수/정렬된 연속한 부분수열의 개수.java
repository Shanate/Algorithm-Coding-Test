import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        long cnt = 0;
        int left = 0;
        
        for (int right = 0; right < n; right++) {
            if (right > 0 && arr[right] <= arr[right - 1]) {
                left = right;
            }
            cnt += right - left + 1;
        }
        System.out.println(cnt);

    }


 /*   static int n;
    static long[] arr;
    static int count = 0;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new long[n];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < n; i++) {
            countSet(i, i);
        }
        System.out.println(count);

    }

    static void countSet(int start, int cur) {
        // 배열 끝에 도달하거나, 오름차순이 되지 않았을 경우
        if (cur >= n || (cur > start && arr[cur] <= arr[cur - 1])) {
            return;
        } // cur > start 명시하지 않았을 때, cur == start일 때 cur-1이 범위를 벗어남.

        count++;

        countSet(start, cur + 1);
    }*/
}

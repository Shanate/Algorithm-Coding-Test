import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int[] dp = new int[N]; // LIS 길이 저장
        int[] prev = new int[N]; // 이전 위치를 추적하는 배열

        Arrays.fill(prev, -1); // 초기값 설정
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int maxLen = 0; // LIS의 길이
        int lastIndex = 0; // LIS의 마지막 요소 인덱스

        for (int i = 0; i < N; i++) {
            dp[i] = 1; // 최소 길이 1
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[i] && dp[i] < dp[j] + 1) {
                    dp[i] = dp[j] + 1;
                    prev[i] = j; // 이전 인덱스 저장
                }
            }

            // 최대 길이 갱신
            if (maxLen < dp[i]) {
                maxLen = dp[i];
                lastIndex = i;
            }
        }

        // LIS 복원
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        while (lastIndex != -1) {
            stack.push(arr[lastIndex]);
            lastIndex = prev[lastIndex];
        }

        System.out.println(maxLen);
        while (!stack.isEmpty()) {
            sb.append(stack.pop()).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}

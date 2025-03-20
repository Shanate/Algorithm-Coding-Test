import java.io.*;
import java.util.*;

// 누적합이 S보다 커지면 앞에서부터 줄인다. 따라서 가리키는 포인터가 두 개가 필요 -> 투 포인터 개념

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        int[] num = new int[n + 1];

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }
        int min = Integer.MAX_VALUE; // 투 포인터가 나올 때 해당 한 줄은 십중팔구 나온다.
        int startIdx = 0; // 시작점
        int endIdx = 0; // 종점
        int sum = 0;

        while (startIdx <= n && endIdx <= n) { // 배열을 넘어가기 전까지 반복
            if(sum < s){ // 부분합이 만족하지 않다면
                sum += num[endIdx]; // end 포인터를 올린다
                endIdx++;
            }
            if(sum >= s){ // 부분합이 일단 만족이 됐다면
                min = Math.min(min, endIdx - startIdx); // 현재까지의 길이가 최소길이인지 확인한다.
                sum -= num[startIdx]; // start 포인터에 걸친 원소를 뺀다.
                startIdx++;
            }
        }
        if (min == Integer.MAX_VALUE) {
            System.out.println(0);
        } else {
            System.out.println(min);
        }
    }
}

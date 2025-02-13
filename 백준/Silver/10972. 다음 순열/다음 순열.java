import java.io.*;
import java.util.*;

/*
재귀 사용해서 처음부터 수열 다 까면, 시간에서 답 안 나온다.
수열이 꺾이는 부분을 찾아서 다음 수열 찾는 것을 목표
*/

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int arr[] = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        if (nextArray(arr)) {
            for (int num : arr) {
                sb.append(num).append(" ");
            }
        } else {
            sb.append("-1");
        }
        System.out.println(sb);
    }

    static boolean nextArray(int[] arr) {

        int i = arr.length - 1; // 배열 마지막 인덱스부터 시작
        while (i > 0 && arr[i - 1] >= arr[i]) { // 배열의 뒷자리가 앞자리보다 커지는 곳 탐색
            i -= 1;
        }
        if (i<=0) return false;


        int j = arr.length - 1;
        while (arr[i - 1] >= arr[j]) {  // 뒷자리보다 커진 자리의 숫자보다 큰 수의 최솟값 찾기
            j -= 1;
        }

        int tmp = arr[j];   // 해당 두 위치의 원소 교환
        arr[j] = arr[i - 1];
        arr[i - 1] = tmp;

        j = arr.length; // 위에서 arr.length - 1로 정의했을 때는 배열의 인덱스를 위함. 여기서는 배열 크기이기 때문에 -1 필요없이 사용

        /*while (i < j) { // 사이의 원소 순서에 맞게 교환.
            tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
            i += 1;
            j -= 1;
        }*/
        Arrays.sort(arr, i, j); // 배열의 일부분만 따로 정렬(i부터 끝까지)
        return true;

    }
}

import java.util.*;
import java.io.*;

public class Main {

    static int[] sorted; // 병합 과정에서 정렬된 값을 담을 임시 배열
    static int k; // 출력해야 할 k 번째
    static int count = 0; // 현재 정렬된 순서의 카운트
    static int result = -1; // k번째 값을 저장할 변수

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        int[] array = new int[n];
        sorted = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }

        merge_sort(array, 0, n - 1);

        // 출력
        System.out.println(result);
    }

    private static void merge_sort(int[] a, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            merge_sort(a, left, mid); // 왼쪽 부분 리스트 정렬
            merge_sort(a, mid + 1, right); // 오른쪽 부분 리스트 정렬
            merge(a, left, mid, right); // 병합
        }
    }

    private static void merge(int[] a, int left, int mid, int right) {
        int l = left; // 왼쪽 부분리스트의 시작점
        int r = mid + 1; // 오른쪽 부분리스트의 시작점
        int idx = left; // 임시 배열에서의 시작점

        while (l <= mid && r <= right) {
            if (a[l] <= a[r]) {
                sorted[idx++] = a[l++];
            } else {
                sorted[idx++] = a[r++];
            }
        }

        // 왼쪽 부분리스트가 남은 경우 처리
        while (l <= mid) {
            sorted[idx++] = a[l++];
        }

        // 오른쪽 부분리스트가 남은 경우 처리
        while (r <= right) {
            sorted[idx++] = a[r++];
        }

        // 정렬된 값을 원본 배열에 복사
        for (int i = left; i <= right; i++) {
            a[i] = sorted[i];

            // k번째 값이 발생했을 경우 저장
            count++;
            if (count == k) {
                result = a[i];
            }
        }
    }
}
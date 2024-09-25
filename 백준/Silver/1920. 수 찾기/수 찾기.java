import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] A = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        for (int i = 0; i < n; i++) {
            A[i] = Integer.parseInt(st.nextToken()); // 4 1 5 2 3
        }
        Arrays.sort(A); // 1 2 3 4 5
        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < m; i++) {
            int target = Integer.parseInt(st.nextToken());

            // 이진 탐색으로 target이 A 배열에 있는지 확인
            if (binarySearch(A, target)) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }

    // 이진 탐색 구현
    private static boolean binarySearch(int[] A, int target) {
        int low = 0;
        int high = A.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (A[mid] == target) {
                return true;
            } else if (A[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return false;
    }
}

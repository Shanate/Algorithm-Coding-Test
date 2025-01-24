import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        LinkedList<Integer> deque = new LinkedList<Integer>();
        int cnt = 0;

        st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[m];

        for (int i = 1; i <= n; i++) {
            deque.offer(i);
        }
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < m; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < m; i++) {
            int target_idx = deque.indexOf(arr[i]);
            int half_idx;

            if(deque.size() % 2 == 0) {
                half_idx = deque.size() / 2 - 1;
            }
            else {
                half_idx = deque.size() / 2;
            }

            // 현재 포인터가 중간 지점의 왼쪽에 있을 때
            if(target_idx <= half_idx) {
            // idx 보다 앞에 있는 원소들을 모두 뒤로 보낸다. (2번 연산)
                for(int j = 0; j < target_idx; j++) {
                    int temp = deque.pollFirst();
                    deque.offerLast(temp);
                    cnt++;
                }
            }
            else {	// 포인터가 중간 지점의 오른쪽에 있을 때
                    // idx를 포함한 뒤에 있는 원소들을 모두 앞으로 보낸다. (3번 연산)
                for(int j = 0; j < deque.size() - target_idx; j++) { // 현재 큐 사이즈에서 왼쪽 배열들을 빼면 오른쪽 배열
                    int temp = deque.pollLast();
                    deque.offerFirst(temp);
                    cnt++;
                }

            }
            deque.pollFirst();
        }
        System.out.println(cnt);
    }
}


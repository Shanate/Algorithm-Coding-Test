import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        ArrayDeque<int[]> queue = new ArrayDeque<>();
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        for (int i = 0; i < n; i++) {
            int paper = Integer.parseInt(st.nextToken());
            queue.offer(new int[]{i + 1, paper});
        }

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            sb.append(current[0]);

            if (!queue.isEmpty()) {
                sb.append(" ");
            }

            int move = current[1];

            if (queue.isEmpty()) {
                break; // 큐가 비었으면 더 이상 이동할 필요 없음
            }

            // 이동할 위치 결정
            if (move > 0) {
                for (int i = 1; i < move; i++) {
                    queue.offerLast(queue.pollFirst()); // 오른쪽으로 이동
                }
            } else {
                for (int i = 0; i < Math.abs(move); i++) {
                    queue.offerFirst(queue.pollLast()); // 왼쪽으로 이동
                }
            }
        }
        System.out.println(sb.toString());
    }
}
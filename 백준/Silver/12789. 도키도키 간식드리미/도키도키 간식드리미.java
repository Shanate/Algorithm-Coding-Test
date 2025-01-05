import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        int N = Integer.parseInt(br.readLine());
        int cnt = 1;
        ArrayDeque<Integer> queue = new ArrayDeque<>();

            st = new StringTokenizer(br.readLine(), " ");

            for (int i = 1; i <= N; i++) {
                int num = Integer.parseInt(st.nextToken());
                if (num != cnt) {
                    queue.push(num);
                } else {
                    cnt++;
                }

                while (!queue.isEmpty() && queue.peek() == cnt) {
                    queue.pop();
                    cnt++;
                }
            }

        if (queue.isEmpty()) {
            System.out.println("Nice");
        } else {
            System.out.println("Sad");
        }
    }
}

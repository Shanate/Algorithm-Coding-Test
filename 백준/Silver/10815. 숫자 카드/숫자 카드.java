import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        StringBuilder sb = new StringBuilder();
        HashSet<Integer> cards = new HashSet<>();
        int n = Integer.parseInt(br.readLine());

            st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            cards.add(Integer.parseInt(st.nextToken()));
        }

        int m = Integer.parseInt(br.readLine());

            st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < m; i++) {
            if(cards.contains(Integer.parseInt(st.nextToken()))) {
                sb.append(1).append(" ");
            }
            else {
                sb.append(0).append(" ");
            }
        }
            System.out.println(sb.toString().trim());
    }
}

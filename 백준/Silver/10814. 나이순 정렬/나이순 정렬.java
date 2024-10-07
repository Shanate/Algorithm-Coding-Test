import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[][] old = new String[n][2];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            old[i][0] = st.nextToken();
            old[i][1] = st.nextToken();
        }
        Arrays.sort(old, new Comparator<String[]>() {
            public int compare(String[] o1, String[] o2) {
                return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
            }
        });


        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(old[i][0]).append(" ").append(old[i][1]).append("\n");
        }
        System.out.println(sb);
    }
}

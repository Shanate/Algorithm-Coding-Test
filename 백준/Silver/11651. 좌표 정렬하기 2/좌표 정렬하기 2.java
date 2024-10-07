import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] x = new int[n][2];
        for (int i = 0; i < n; i++) {
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        x[i][0] = Integer.parseInt(st.nextToken());
        x[i][1] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(x, (o1, o2) -> {
            if(o1[1] == o2[1]){ // y 값이 같으면
                return o1[0] - o2[0]; // x를 비교
            } else{
                return o1[1] - o2[1]; // y 값이 다르면, y를 비교
            }
        });
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++) {
            sb.append(x[i][0]).append(" ").append(x[i][1]).append("\n");
        }
        System.out.println(sb);
    }
}

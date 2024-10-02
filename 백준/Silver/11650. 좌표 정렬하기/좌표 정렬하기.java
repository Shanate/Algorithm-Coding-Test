import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[][] xi = new int[n][2];
        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            xi[i][0] = Integer.parseInt(st.nextToken());
            xi[i][1] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(xi, (o1, o2) -> {
            if(o1[0] == o2[0]){
                return o1[1] - o2[1];
            } else{
                return o1[0] - o2[0];
            }
        });
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++) {
            sb.append(xi[i][0]).append(" ").append(xi[i][1]).append("\n");
        }
        System.out.println(sb);
    }
}

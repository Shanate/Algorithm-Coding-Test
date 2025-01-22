import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        while (N-- > 0) {
            int people = Integer.parseInt(br.readLine());
            int[] paper = new int[people];
            for(int i = 0; i < people; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                paper[a-1] = b;
            }
            int cnt = 1;
            int grade = paper[0];
            for (int i = 1; i < people; i++) {
                if(grade>paper[i]) {
                    cnt++;
                    grade = paper[i];
                }
            }
            System.out.println(cnt);
        }
    }
}

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] xDots = new int[N];
        int[] yDots = new int[N];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            xDots[i] = Integer.parseInt(st.nextToken());
            yDots[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(xDots);
        Arrays.sort(yDots);

        int x = xDots[N-1] - xDots[0];
        int y = yDots[N-1] - yDots[0];
        System.out.println(x*y);

    }
}

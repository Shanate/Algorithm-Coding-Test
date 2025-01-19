import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<Integer, Integer> x = new HashMap<>();
        HashMap<Integer, Integer> y = new HashMap<>();
        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int xDot = Integer.parseInt(st.nextToken());
            int yDot = Integer.parseInt(st.nextToken());
            x.put(xDot, x.getOrDefault(xDot, 0) + 1);
            y.put(yDot, y.getOrDefault(yDot, 0) + 1);
        }
        for (Integer key : x.keySet()) {
            if (x.get(key) == 1) {
                System.out.print(key + " ");
            }
        }
        for (Integer key : y.keySet()) {
            if (y.get(key) == 1) {
                System.out.print(key);
            }
        }
    }
}

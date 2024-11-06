import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<Long, Integer> card = new HashMap<>();
        int n = Integer.parseInt(br.readLine());
        int max = 0;
        long answer = 0;
        for (int i = 0; i < n; i++) {
            long num = Long.parseLong(br.readLine());
            card.put(num, card.getOrDefault(num, 0) + 1);

            if (card.get(num) > max) {
                max = card.get(num);
                answer = num;
            } else if (card.get(num) == max) {
                answer = Math.min(answer, num);
            }
        }
        System.out.println(answer);
    }
}

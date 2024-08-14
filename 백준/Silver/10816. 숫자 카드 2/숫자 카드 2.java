import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {

      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringBuffer sb = new StringBuffer();
      int n = Integer.parseInt(br.readLine());
      HashMap<Integer, Integer> map = new HashMap<>();
      StringTokenizer st = new StringTokenizer(br.readLine()," ");
      for (int i = 0; i < n; i++) {
          int card = Integer.parseInt(st.nextToken());
          map.put(card, map.getOrDefault(card, 0) + 1);
      }

      int m = Integer.parseInt(br.readLine());
      st = new StringTokenizer(br.readLine()," ");
      for (int i = 0; i < m; i++) {
            int pick = Integer.parseInt(st.nextToken());
            if(map.containsKey(pick)) {
                sb.append(map.get(pick)).append(" ");
            }
            else {
                sb.append(0).append(" ");
            }
      }
        System.out.println(sb.toString().trim());
    }
}
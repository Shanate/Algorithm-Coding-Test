import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        long b = Long.parseLong(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashMap<String, Long> items = new HashMap<>();

        for(int i=0; i<n; i++){
        st = new StringTokenizer(br.readLine(), " ");
            String name = st.nextToken();
            long cost = Long.parseLong(st.nextToken());
            items.put(name, cost);
        }
        for(int i=0; i<m; i++){
        st = new StringTokenizer(br.readLine(), " ");
            String buyItem = st.nextToken();
            b -= items.get(buyItem);
        }
        if (b < 0) {
            System.out.println("unacceptable");
        } else {
            System.out.println("acceptable");
        }

    }
}

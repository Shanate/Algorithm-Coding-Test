import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int cnt = 0;
        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < N; i++) {
            String chat = br.readLine();

            if (chat.equals("ENTER")) {
                set.clear();
            } else {
                if(!set.contains(chat)) {
                    set.add(chat);
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<Character, Integer> map = new HashMap<>();
        String str1 = br.readLine();
        String str2 = br.readLine();
        for (int i = 0; i < str1.length(); i++) {
            char ch1 = str1.charAt(i);
            map.put(ch1, map.getOrDefault(ch1, 0) + 1);
        }
        for (int i = 0; i < str2.length(); i++) {
            char ch2 = str2.charAt(i);
                map.put(ch2, map.getOrDefault(ch2, 0) - 1);
            }

        int cnt = 0;
            for(int value : map.values()){
                cnt += Math.abs(value);
            }
        System.out.println(cnt);

    }
}

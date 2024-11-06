import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<String> set = new HashSet<>();
        String str = br.readLine();

        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j <= str.length(); j++) {
                set.add(str.substring(i, j)); // substring(i, j) i에서 시작해서 j 이전까지의 문자열을 뽑는다.
            }
        }
        System.out.println(set.size());
    }
}

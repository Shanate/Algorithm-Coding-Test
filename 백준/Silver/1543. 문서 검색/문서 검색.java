import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cnt = 0;
        String words = br.readLine();
        String searchWord = br.readLine();

        while (words.contains(searchWord)) {
            
            words = words.replaceFirst(searchWord, "_");
            cnt++;
            
        }
        System.out.println(cnt);

    }
}
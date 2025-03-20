import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        int sum = 0;

        for(int i=0; i<str.length(); i++){
            int number = str.charAt(i) - '0';
            sum += number;
        }
        System.out.println(sum);
    }
}

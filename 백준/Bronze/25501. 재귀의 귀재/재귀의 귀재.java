import java.io.*;
import java.util.*;

public class Main {

    static int cnt;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            cnt = 0;

            int palindromeResult = isPalindrome(s);

            sb.append(palindromeResult).append(" ").append(cnt).append("\n");
        } // i
        System.out.println(sb.toString());

    } // main

    static int isPalindrome(String s) {
        return recursion(s, 0, s.length() - 1);
    }

    static int recursion(String s, int l, int r) {
        cnt++;

        if(l >= r) return 1;
        else if(s.charAt(l) != s.charAt(r)) return 0;
        else return recursion(s, l+1, r-1);
    }

} // class

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int[] strArr = new int[26];
        Arrays.fill(strArr, -1); // baekjoon
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(strArr[ch-'a'] != -1) {
                continue;
            }
            strArr[ch-'a'] = i;
        }
        for(int ans : strArr){
            System.out.print(ans + " ");
        }
    } // main
} // class

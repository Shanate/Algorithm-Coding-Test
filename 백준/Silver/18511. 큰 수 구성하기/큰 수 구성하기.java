import java.io.*;
import java.util.*;

public class Main {
        static int n;
        static int k;
        static int[] num;
        static int max;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        num = new int[n];
        max = 0;

            st = new StringTokenizer(br.readLine()," ");
        for (int i = 0; i < k; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        } // for

        recur(0);
        System.out.println(max);


    } // main

    private static void recur(int curNum) {
        if (curNum > n) {
            return;
        }

        if (curNum > max) {
            max = curNum;
        }

        for (int i = 0; i < k; i++) {
            recur(curNum*10 + num[i]);
        }
    }

} // class

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            String str = br.readLine();
            int len = 0;
            if(str.equals("0")) break;

            len += 1;
            for (int i = 0; i < str.length(); i++) {
                int num = str.charAt(i)- '0';
                if(num == 1){
                    len += 2;
                } else if(num == 0){
                    len += 4;
                } else {
                    len += 3;
                }
                len += 1;
            } // for
            System.out.println(len);
        } // while
    }
}

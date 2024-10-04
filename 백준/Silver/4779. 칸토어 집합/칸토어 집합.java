import java.io.*;
import java.util.*;

public class Main {

        static int n;
        static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while((str = br.readLine()) != null){
            n = Integer.parseInt(str);
            sb = new StringBuilder();
            int line = (int) Math.pow(3, n);

            for(int i=0; i<line; i++){
                sb.append("-");
            }
            recur(0, line); // start index, length
            System.out.println(sb);
        }

    }

    static void recur(int start, int lines) {
        if(lines == 1){
            return;
        }
        int size = lines/3;
            sb.replace(start + size, start + (2 * size), " ".repeat(size));
            // sb.replace(start + size, start + (2 * size), " "); 를 사용하지 못하는 이유
            // 해당 길이만큼을 " " 이걸로 대체하겠다는 의미이다. 하나의 공백만을 사용한다.
/*
StringBuilder sb = new StringBuilder("---------"); // 길이 9
int start = 0;
int size = 3;
sb.replace(start + size, start + 2 * size, " ");
System.out.println(sb);
result :
--- ----

*/


        recur(start, size);
        recur(start + 2 * size, size);
    }
}

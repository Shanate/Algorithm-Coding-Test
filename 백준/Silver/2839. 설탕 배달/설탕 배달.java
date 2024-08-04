import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int a = 3;
        int b = 5;
//      3x + 5y = N
//      3x + 5y = 18

        int result = -1;
        for(int y=N/b; y>=0; y--){

            int R = N - (5*y);
            if( R%a == 0 ){
                int x = R/a;
            result = x+y;
            break;
            }
        }
        System.out.println(result);

    }
}

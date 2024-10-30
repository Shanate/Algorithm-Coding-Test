import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());

        int stick = 64;
        int temp = 0;
        int count = 0;
        int result = X;

        while (true) {

            if (X == 64) {
                count++;
                break;
            }

            stick /= 2; //
            if (stick <= X) {
                temp += stick;
                count++;
                if (result == temp) {
                    break;
                }
                X -= stick;
            }

        }
        System.out.println(count);

    }
}

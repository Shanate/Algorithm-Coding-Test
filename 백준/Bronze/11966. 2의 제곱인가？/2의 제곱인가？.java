import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());
        int answer = 3;

        while (true) {
            if (num % 2 != 0) {
                break;
            } else {
                num /= 2;
            }
        }

        if (num == 1){
            answer = 1;
        }else{
            answer = 0;
        }

        sb.append(answer);
        System.out.println(sb.toString());
    }
}
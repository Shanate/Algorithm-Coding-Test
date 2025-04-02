import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());
        String answer = "";

        if (num % 3 == 1){
            answer = "U";
        }else if (num % 3 == 2){
            answer = "O";
        }else{
            answer = "S";
        }

        sb.append(answer);
        System.out.println(sb.toString());

    }
}
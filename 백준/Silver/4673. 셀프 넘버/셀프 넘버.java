import java.io.*;
import java.util.*;

public class Main {

    static boolean[] visited;

    public static void main(String[] args) throws Exception {
        visited = new boolean[10001];
        for( int i = 1; i <= 10000; i++){
            int n = generate(i);
            if (n <= 10000){
                visited[n] = true;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 10000; i++) {
            if (!visited[i]) { 
                sb.append(i).append("\n");
            }
        }

        System.out.print(sb.toString());
    }

    static int generate(int number) {
        int sum = number;
        while(number != 0){
            sum = sum + (number % 10);
            number = number / 10;
        }
        return sum;
    }
}

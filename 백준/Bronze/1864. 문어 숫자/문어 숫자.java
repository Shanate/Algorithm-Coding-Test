import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        HashMap<Character, Integer> exp = new HashMap<>();
        exp.put('-', 0);
        exp.put('\\', 1);
        exp.put('(', 2);
        exp.put('@', 3);
        exp.put('?', 4);
        exp.put('>', 5);
        exp.put('&', 6);
        exp.put('%', 7);
        exp.put('/', -1);

        while(true) {
            String eightToTen = br.readLine();
            if(eightToTen.equals("#")) break;
            int Ten = 0;

            for(int i=0; i<eightToTen.length(); i++){ // ( @ &
                char ch = eightToTen.charAt(i);
                int num = exp.get(ch);
                Ten += num * (int) Math.pow(8, eightToTen.length() - (i + 1));
//                Ten += num * 8^(eightToTen.length()-(i+1));
//                System.out.println(i + " 번 째 : " + Ten);
            }
            System.out.println(Ten);

        }
    }
}

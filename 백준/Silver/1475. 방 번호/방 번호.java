import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<Character, Integer> number = new HashMap<>();
        String str = br.readLine();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            number.put(ch, number.getOrDefault(ch, 0) + 1);
        }   // 6, 9는 카운팅을 절반으로 바꾸고, 카운팅이 가장 높은 수의 Value를 빼내면 된다.
        int sixNine = number.getOrDefault('6',0)
                + number.getOrDefault('9',0);
        number.put('6', (sixNine + 1) / 2);
        number.put('9', 0);

        int count = 0;
        for(int Count : number.values()) {
            if(Count > count){
                count = Count;
            }
        }
        System.out.println(count);
    }
}
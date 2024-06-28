import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[] numArr = new boolean[42];
        int count = 0;

        for(int i=0; i<10; i++){
            int num = Integer.parseInt(br.readLine());
//            numArr[i] = num; // 입력 받은 제수를 배열에 입력
            numArr[num%42] = true; // 나머지가 들어온 부분을 열어준다.
        }
        for(boolean result : numArr){
            if(result) count++;
        }
        System.out.println(count);
    }
}
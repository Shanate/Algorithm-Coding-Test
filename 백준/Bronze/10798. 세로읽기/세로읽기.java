import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        char[][] words = new char[5][15];
        for(int i=0; i<5; i++){
            String input = br.readLine();
            for(int j=0; j<input.length(); j++){
                words[i][j] = input.charAt(j); // 입력받은 문자열을 j열에 할당
            }
        }
        for(int j=0; j<15; j++){ // 열로 출력
            for(int i=0; i<5; i++){
                if(words[i][j] == '\0') continue; // 해당 원소가 Null일 경우 프린트 X
                System.out.print(words[i][j]);
            }
        }
    }
}

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] students = new int[31]; // 학생 번호 활성화  // 0:X   [1~30]

        for(int i=1; i<=28; i++) { // 출석 번호 확인   // 30명 중 28명
            int number = Integer.parseInt(br.readLine());
            students[number] = number;
        }
        for(int i=1; i<=30; i++){
            if(students[i] == 0)
                System.out.println(i);
        }
    }
}
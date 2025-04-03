import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 입력 받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        int p = Integer.parseInt(line[0]);
        int w = Integer.parseInt(line[1]);
        String s = br.readLine();

        // 문자 → 키 번호 (같은 키는 같은 숫자), 누를 횟수
        int[] number = {
            2, 2, 2,     // A B C
            3, 3, 3,     // D E F
            4, 4, 4,     // G H I
            5, 5, 5,     // J K L
            6, 6, 6,     // M N O
            7, 7, 7, 7,  // P Q R S
            8, 8, 8,     // T U V
            9, 9, 9, 9   // W X Y Z
        };

        int[] press = {
            1, 2, 3,     // A B C
            1, 2, 3,     // D E F
            1, 2, 3,     // G H I
            1, 2, 3,     // J K L
            1, 2, 3,     // M N O
            1, 2, 3, 4,  // P Q R S
            1, 2, 3,     // T U V
            1, 2, 3, 4   // W X Y Z
        };

        long time = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLetter(ch)) {
                int idx = ch - 'A';
                // 이전 문자와 같은 키인지 확인
                if (i > 0) {
                    char prev = s.charAt(i - 1);
                    if (Character.isLetter(prev)) {
                        if (number[prev - 'A'] == number[idx]) {
                            time += w;
                        }
                    }
                }
                time += press[idx] * p;
            } else {
                // 공백이나 특수문자는 1번만 누름
                time += p;
            }
        }

        System.out.println(time);
    }
}
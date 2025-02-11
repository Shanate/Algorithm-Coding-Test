import java.io.*;
import java.util.*;

/*
1. DFS 완전 탐색
2. 종료 조건에서 자음, 모음 갯수 충족 확인
*/

public class Main {

    static int L, C;
    static String[] spell;
    static List<String> vowels = Arrays.asList("a", "e", "i", "o", "u");

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        L = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        spell = new String[C];


        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < C; i++) {
            spell[i] = st.nextToken();
        }
        Arrays.sort(spell);

        back("", 0, 0,0);
    }

    static void back(String cur, int start, int vowelsCount, int consonantsCount) {
    if(cur.length() == L) {
        if (vowelsCount >= 1 && consonantsCount >= 2) {

            System.out.println(cur);
        }
        return;
    }
        for (int i = start; i < C; i++) {
            String password = spell[i];

            if (vowels.contains(password)) {
                back(cur + password, i + 1, vowelsCount + 1, consonantsCount);
            } else {
                back(cur + password, i + 1, vowelsCount, consonantsCount + 1);
            }
        }
    }
}

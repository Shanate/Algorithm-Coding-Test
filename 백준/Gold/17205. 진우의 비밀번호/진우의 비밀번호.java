import java.io.*;

/*
a~z : 26 sec
*/

public class Main {

    static int N;
    static String password;


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        password = br.readLine();

        long result = findPassword(0, 0);
        System.out.println(result);
    }

    static long findPassword(int cur, long count) {
        if (cur == password.length()) return count; // 종료 조건

        char curSpell = password.charAt(cur);
        int diff = curSpell - 'a';  // 현재 자리에서 앞에 오는 알파벳 개수
        long prefixCount = diff * prefixCounts(N - cur - 1);

        return findPassword(cur + 1, count + prefixCount + 1);
    }

    // 재귀적으로 cnt[i] 값 계산 (cnt[i] = cnt[i-1] * 26 + 1)
    static long prefixCounts(int length) {
        if (length == 0) return 1;
        return prefixCounts(length - 1) * 26 + 1;
    }
}

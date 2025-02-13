import java.io.*;
import java.util.*;
/*
input : bca
pw : ac
b=1, c=2, a=3
pw : ac -> 32(3)
3*(3^1) + 2*(3^0) = 11
*/
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str  = br.readLine();
        int[] set = new int[128]; // 아스키 코드 찾아보니까 127까지 존재
        int numeralSys = str.length(); // 입력받은 집합으로 진법 표기
        int base = 1; // 밑
        int ans = 0;

        for (int i = 1; i < str.length() + 1; i++) {
            set[str.charAt(i - 1)] = i; // set[b] = 1, set[c] = 2, set[a] = 3
        }   // 0부터 시작하면 진법 변환 시 0* 가 되어버려서 답이 안 나옴.

        String password = br.readLine();


        for (int i = password.length() - 1; i >= 0; i--) { // password -> numeralSys 진법 변환.
            ans = (ans + base * set[password.charAt(i)]) % 900528;
            base = base * numeralSys % 900528;
        }

        System.out.println(ans);

    }
}

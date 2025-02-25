import java.util.*;
import java.io.*;

/*
[백준] 14490번 - 백대열 (Java)
*/

public class Main {
    static int N, number;
    static int A[];
    
    void InputData() {
        Scanner in = new Scanner(System.in);
        //N = in.nextInt();
        String str = in.next();
        String s[] = str.split(":");
        A = new int[2];
        for (int i=0; i<2; i++) {
            A[i] = Integer.parseInt(s[i]);
        }
    }

    // 최대공약수 (유클리드 호제법)
    // b%a의 나머지 r1
    // a%r1의 나머지 r2
    // r이 0이 나오면 b%a의 a가 최대공약수이다.
    int GCD(int a, int b) {
        if (b%a == 0) return a;
        else return GCD(b%a, a);
    }

    void Solve() {
        int num = 0;
        num = GCD(A[0], A[1]);
        //System.out.println(num);
        System.out.println(A[0]/num+":"+A[1]/num);
    }

	public static void main(String[] args) {
        Main m = new Main();
        m.InputData();
        m.Solve();
	}
}
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());

        if (A + B + C != 180) {
            System.out.println("Error");
        } else if (A == 60 && B == 60 && C == 60) {
            System.out.println("Equilateral");
        } else if (A == B || B == C || C == A) {
            System.out.println("Isosceles");
        } else if (A != B && B != C && C != A) {
            System.out.println("Scalene");
        }
    }
}

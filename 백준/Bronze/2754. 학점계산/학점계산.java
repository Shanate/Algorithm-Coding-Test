import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, String> grade = new HashMap<>();
        grade.put("A+", String.valueOf(4.3));
        grade.put("A0", String.valueOf(4.0));
        grade.put("A-", String.valueOf(3.7));
        grade.put("B+", String.valueOf(3.3));
        grade.put("B0", String.valueOf(3.0));
        grade.put("B-", String.valueOf(2.7));
        grade.put("C+", String.valueOf(2.3));
        grade.put("C0", String.valueOf(2.0));
        grade.put("C-", String.valueOf(1.7));
        grade.put("D+", String.valueOf(1.3));
        grade.put("D0", String.valueOf(1.0));
        grade.put("D-", String.valueOf(0.7));
        grade.put("F", String.valueOf(0.0));

        System.out.println(grade.get(br.readLine()));

    }
}

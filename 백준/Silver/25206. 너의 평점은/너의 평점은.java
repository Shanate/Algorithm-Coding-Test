import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = 20;
        String subject; // 과목
        double grade; // 학점
        double sum = 0;
        double totalGrade = 0;
        String rank; // 등급

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            subject = st.nextToken();
            grade = Double.parseDouble(st.nextToken());
            rank = st.nextToken();

            if(rank.equals("P")){
                continue;
            }
                double score = 0;
                switch (rank){
                    case "A+":
                        score = 4.5;
                        break;
                    case "A0":
                        score = 4.0;
                        break;
                    case "B+":
                        score = 3.5;
                        break;
                    case "B0":
                        score = 3.0;
                        break;
                    case "C+":
                        score = 2.5;
                        break;
                    case "C0":
                        score = 2.0;
                        break;
                    case "D+":
                        score = 1.5;
                        break;
                    case "D0":
                        score = 1.0;
                        break;
                    case "F":
                        score = 0.0;
                        break;
                }
            sum += grade * score;
            totalGrade += grade;
        }
        double answer = sum / totalGrade;
        System.out.printf("%.6f", answer);
    }
}

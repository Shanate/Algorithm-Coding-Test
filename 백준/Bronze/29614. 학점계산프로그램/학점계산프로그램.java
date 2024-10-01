import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        double sum = 0;
        double grade = 0;
        char rank;
        double cnt = 0;

        for(int i=0; i<s.length(); i++){
            double score = 0;
            rank = s.charAt(i);

            if(rank == '+'){
                score = 0.5;
            }
            switch(rank){
                case 'A':
                    score = 4.0;
                    cnt++;
                    break;
                case 'B':
                    score = 3.0;
                    cnt++;
                    break;
                case 'C':
                    score = 2.0;
                    cnt++;
                    break;
                case 'D':
                    score = 1.0;
                    cnt++;
                    break;
                case 'F':
                    score = 0.0;
                    cnt++;
                    break;
            }
            sum += score;
        }
        grade = sum/cnt;
        System.out.printf("%.5f", grade);
    }
}

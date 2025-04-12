import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {
        // N명의 학생과 K개의 과목
        // 각 등급별 범위가 G로 주어진다.
        // 준영이의 각 등급을 구하라

        // 해당 과목에서 준영이가 받은 등수에
        // 100을 곱한 뒤 학생 수로 나눈 몫과 같다.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        // 준영이의 등수
        int [] grade = new int [K];
        // 백분율로 환산할 배열
        int [] percent = new int [K];

        st = new StringTokenizer(br.readLine());

        // 준영이의 과목에 대한 등수를 받아온다.
        for (int i = 0; i < K; i++) {
            grade[i] = Integer.parseInt(st.nextToken());
            // 등수를 백분율로 환산한다
            percent[i] = grade[i] * 100 / N;

            // 각 백분율을 등급으로 환산한 뒤, 출력한다.
            if (percent[i] <= 4){
                sb.append(1).append(" ");
            }else if(percent[i] <= 11){
                sb.append(2).append(" ");
            } else if (percent[i] <= 23) {
                sb.append(3).append(" ");
            }else if(percent[i] <= 40){
                sb.append(4).append(" ");
            }else if(percent[i] <= 60){
                sb.append(5).append(" ");
            }else if(percent[i] <= 77){
                sb.append(6).append(" ");
            }else if(percent[i] <= 89){
                sb.append(7).append(" ");
            }else if(percent[i] <= 96){
                sb.append(8).append(" ");
            }else {
                sb.append(9).append(" ");
            }
        }

        System.out.println(sb.toString());
    }
}

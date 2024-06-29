import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        float[] grade = new float[N];
        float sum = 0;
        float average = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            grade[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(grade); // 점수 오름차순
        float high = grade[N-1]; // 최고점

        for(int i=0; i<N; i++) { // 점수 조정
            grade[i] = (grade[i] / grade[N - 1]) * 100;
            sum += grade[i];
//            System.out.println(Arrays.toString(grade));
            // 40 60 80
        }
            average = sum / N;
        System.out.println(average);
    }
}

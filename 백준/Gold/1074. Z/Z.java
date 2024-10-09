import java.io.*;
import java.util.*;

public class Main{

    static int cnt;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken()); // 2^n X 2^n의 정사각형 배열
        int r = Integer.parseInt(st.nextToken()); // 행
        int c = Integer.parseInt(st.nextToken()); // 열
        cnt = 0;
        int size = (int) Math.pow(2, n);

        findNum(size, r, c);
        System.out.println(cnt);
    }

    static void findNum(int SIZE, int R, int C) {
        if(SIZE == 1){ // 종료조건. 다 쪼갰다.
            return;
        }
        else if(R < SIZE/2 && C < SIZE/2){
            findNum(SIZE / 2, R, C);
        }
        else if(R < SIZE/2 && C >= SIZE/2){
            cnt += SIZE * SIZE /4;
            findNum(SIZE / 2, R, C - SIZE / 2);
        }
        else if(R >= SIZE/2 && C < SIZE/2){
            cnt += (SIZE * SIZE / 4) * 2;
            findNum(SIZE/2, R - SIZE/2, C);
        }
        else {
            cnt += (SIZE * SIZE / 4) * 3;
            findNum(SIZE/2, R - SIZE/2, C - SIZE/2);
        }
    }
}

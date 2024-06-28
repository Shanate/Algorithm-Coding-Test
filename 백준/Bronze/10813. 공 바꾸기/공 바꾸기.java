import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] basket = new int[N+1];

        for(int i=1; i<=N; i++){
            basket[i] = i; // 바구니와 공의 번호 일치화
        }
        basket[0] = 0; // 임시 저장소(tmp)

        for(int i=1; i<=M; i++){
            st = new StringTokenizer(br.readLine());
            int prev = Integer.parseInt(st.nextToken()); // i번 바구니
            int next = Integer.parseInt(st.nextToken()); // j번 바구니
//**********임시 저장소를 사용해서 공 바꾸기
            basket[0] = basket[prev];
            basket[prev] = basket[next];
            basket[next] = basket[0];
        }
        for(int i=1; i<=N; i++){
            System.out.print(basket[i]+" ");
        }
    }
}
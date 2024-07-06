
import java.io.*;
import java.util.*;

public class Main {
    static int N, M;
    static int[] a = new int[N];
    static int[] b = new int[3];
    static int MAX = 0;

    static void comb(int cnt, int start, int sum) {
//            System.out.println("cnt: "+cnt+" start: "+start+" sum :"+sum);
        if(cnt==3){//종료조건
            if(sum <= M) {
//                System.out.println(Arrays.toString(b));
//                System.out.println("------------------------------");
                MAX = Math.max(MAX, sum);
            }
            return;
        }
        for(int i=start; i<N; i++){
            b[cnt] = a[i];
//            System.out.println(a[i]);
//                System.out.println(Arrays.toString(b));
        comb(cnt+1,i+1, sum + a[i]);
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        a = new int[N];
        ///////////순서 X => Combination, 조합 중에 합이 최대치를 넘지 않는 MAX를 구한다.
        st = new StringTokenizer(br.readLine(), " ");
        for (int i=0; i<N; i++){
            a[i] = Integer.parseInt(st.nextToken());
//            System.out.println(Arrays.toString(arr));
        }
        comb(0,0, 0);
        System.out.println(MAX);
    }

}

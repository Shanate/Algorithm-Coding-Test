import java.io.*;
import java.util.*;

//문제 핵심은 저점에 사서 고점에 판다.
//샀을 때 처음부터 다시 계산하는게 아니라 본인 이후를 계산해야 한다. for 문 돌릴 때 조심.
//처음에 탐색할 때 값이 계속 떨어진다면 사면 안 되겠죠.
//가 아니라? Max 값을 먼저 찾는다. 그러면 자신의 앞을 다시 조회하면 되니깐. 이게 구현이 더 쉬울듯

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
            st = new StringTokenizer(br.readLine()," ");
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
            }

        int max = 0;

    for(int i=1; i<n; i++) {
        if(a[i] > a[max]){
            max = i;
            }
        }
    int min = a[0];
    int dif = 0;

    for(int i=1; i<n; i++){
        dif = Math.max(dif, a[i]-min);
        min = Math.min(min, a[i]);
    }

        System.out.println(dif);

    }
}

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        HashSet<Integer> setA = new HashSet<>();
        HashSet<Integer> setB = new HashSet<>();

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < A; i++) {
            setA.add(Integer.parseInt(st.nextToken()));
        }
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < B; i++) {
            setB.add(Integer.parseInt(st.nextToken()));
        }
        int cnt = 0;
        for(int num : setA){
            if(!setB.contains(num)){
                cnt++;
            }
        }
        for(int num : setB){
            if(!setA.contains(num)){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}

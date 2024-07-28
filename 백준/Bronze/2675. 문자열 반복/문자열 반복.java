import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = null;
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine(), " ");
            int R = Integer.parseInt(st.nextToken());
            String S = st.nextToken();

            for(int j = 0; j < S.length(); j++){
                for(int k = 0; k < R; k++){
                    sb.append(S.charAt(j));
                }
            }
            sb.append("\n");
        }
        System.out.print(sb.toString());
    }
}
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        ArrayList<Integer> arr = new ArrayList<>();
        int N = Integer.parseInt(br.readLine());

        for(int i=0; i<N; i++){
            arr.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(arr);
        for(int ans : arr){
            sb.append(ans).append('\n');
        }
        System.out.println(sb);
    }
}

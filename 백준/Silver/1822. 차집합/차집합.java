import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        TreeSet<Integer> setA  = new TreeSet<>();

            st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < A; i++) {
            setA.add(Integer.parseInt(st.nextToken()));
        }
            st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < B; i++) {
            setA.remove(Integer.parseInt(st.nextToken()));
        }
        System.out.println(setA.size());
        if(!setA.isEmpty()) {
            setA.stream().forEach(x -> System.out.print(x + " "));
        } else{
            return;
        }
    }
}

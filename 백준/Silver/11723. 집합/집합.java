import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        String orders;
        int nums = 0;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            orders = st.nextToken();
            if(!orders.equals("all") && !orders.equals("empty")) {
                nums = Integer.parseInt(st.nextToken());
            }
            if(orders.equals("add")) {
                    set.add(nums);
                }
            else if (orders.equals("remove")) {
                    set.remove(nums);
                }
            else if (orders.equals("check")) {
                    sb.append(set.contains(nums) ? "1" : "0").append("\n");
                }
            else if (orders.equals("toggle")) {
                if (set.contains(nums)) {
                    set.remove(nums);
                } else {
                    set.add(nums);
                }
            } else if (orders.equals("all")){
                set.clear();
                for(int j=1; j<=20; j++){
                    set.add(j);
                }
            } else if (orders.equals("empty")){
                set.clear();
            }
        }
        System.out.println(sb.toString().trim());
    }
}

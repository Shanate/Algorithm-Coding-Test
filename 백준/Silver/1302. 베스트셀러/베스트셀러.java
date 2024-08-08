import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        HashMap<String, Integer> map = new HashMap<String, Integer>();
        String str = new String();
        int max= 0;
        for(int i=0; i<N; i++){
            str = br.readLine();
            if(map.containsKey(str)){
                map.replace(str, map.get(str)+1);
            }
            else{
                map.put(str, 1);
            }
        }
        for (String key : map.keySet()) {
            max = Math.max(max, map.get(key));
        }
        ArrayList<String> list = new ArrayList<>(map.keySet());
        Collections.sort(list);
        for(String s : list){
            if(map.get(s) == max){
                System.out.println(s);
                break;
            }
        }
    }
}

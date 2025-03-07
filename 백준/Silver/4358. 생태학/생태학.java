import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int total = 0;

        HashMap<String, Integer> dictionary = new HashMap<>();
        String str;

        while((str = br.readLine()) != null){

            dictionary.put(str, dictionary.getOrDefault(str, 0) + 1);
            total++;
        }
        ArrayList<String> list = new ArrayList<>();
        for(HashMap.Entry<String, Integer> entry : dictionary.entrySet()){
            String key = entry.getKey();
            list.add(key);
        }
        Collections.sort(list);
        for(String key : list){
            int cnt = dictionary.get(key) * 100;
            sb.append(key + " " + String.format("%.4f", (double) cnt / (double) total) + "\n");
        }
        System.out.println(sb);
    }
}

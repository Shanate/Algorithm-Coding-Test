import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        // 자주 나오는 단어 -> HashMap에서 카운팅
        // 길이가 길수록 앞에? 우선순위 큐를 사용하던가 size를 한 번 재야겠다.
        // 알파벳 사전 순으로 배치
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String words = br.readLine();
            if (words.length() >= m) {
                map.put(words, map.getOrDefault(words, 0) + 1);
            }
        }

        PriorityQueue<String> pq = new PriorityQueue<>((o1, o2) ->
                // 1번 조건. 단어 빈도수
        {
            if(map.get(o2) != map.get(o1)){
            return map.get(o2) - map.get(o1);
            }
                // 2번 조건. 단어 길이 순서
            if(o1.length() != o2.length()){
                return o2.length() - o1.length();
            }
                // 3번 조건. 알파벳 순서
            return o1.compareTo(o2);
        });
            pq.addAll(map.keySet());

            while(!pq.isEmpty()){
                sb.append(pq.poll()).append("\n");
            }
                System.out.println(sb.toString());
    }
}

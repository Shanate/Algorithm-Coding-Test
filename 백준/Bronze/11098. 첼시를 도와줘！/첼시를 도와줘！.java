import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        int n = Integer.parseInt(br.readLine());
        HashMap<Integer, String> players = new HashMap<>();
        for(int i=0; i<n; i++) {
            players.clear(); // 케이스마다 초기화
        int p = Integer.parseInt(br.readLine());
            for(int j=0; j<p; j++) {
        st = new StringTokenizer(br.readLine()," ");
                int price = Integer.parseInt(st.nextToken());
                String name = st.nextToken();
                players.put(price, name); // 가격을 키, 이름을 값으로 저장
            }
            // 키들을 배열로 변환
            Object[] PKeys = players.keySet().toArray();
            // 내림차순으로 정렬
            Arrays.sort(PKeys, Collections.reverseOrder());
            // 가장 큰 키(가격)에 해당하는 선수의 이름 출력
            System.out.println(players.get(PKeys[0]));
        } // for
    } // main
} // class

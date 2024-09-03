import java.util.*;
class Solution {
        static boolean[] visited;
        static String answer;
        static ArrayList<String> trip;

    static String[] solution(String[][] tickets) {
        String[] answer = {};
        visited = new boolean[tickets.length];
        trip = new ArrayList<>();

        Arrays.fill(visited, false); // 방문 처리 초기화

        dfs("ICN", "ICN", tickets, 0); // 출발지 도착지 카운팅

        Collections.sort(trip); // 여러 루트 저장한 것을 오름차순 정리

        return answer = trip.get(0).split(" "); // 첫 루트를 뽑아낸다.
    }

    static void dfs(String departure, String arrival, String[][] tickets, int depth) {
        if(depth == tickets.length) {
            trip.add(arrival); // 항공권 루트를 한번에 저장
            return;
        }

        for (int i = 0; i < tickets.length; i++) {
            if(!visited[i] && departure.equals(tickets[i][0])) { // 현재 항공권의 출발지 && 방문 처리를 확인
                visited[i] = true;
            //  dfs(도착지->출발지, 경로, 티켓, 카운팅)
                dfs(tickets[i][1], arrival+" "+tickets[i][1], tickets, depth + 1);
                visited[i] = false; // 백트래킹
                }
            }
    }
}

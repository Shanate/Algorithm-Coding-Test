import java.util.*;
class Solution {

    static Map<Node, HashSet<Node>> map = new HashMap<>();

    static int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1};
    static int[] dy = {0, 1, 1, 1, 0, -1 ,-1 ,-1};

    static int solution(int[] arrows) {
        int answer = 0;

        map.put(new Node(0, 0), new HashSet<>());

        Node cur = new Node(0, 0);

        for(int i = 0 ; i < arrows.length; i++) {

            int direction = arrows[i];

            for (int j = 0; j < 2; j++) {
                int x = cur.x + dx[direction];
                int y = cur.y + dy[direction];

                Node next = new Node (x, y); //다음으로 방문할 점

                if (!map.containsKey(next)) {
                    //다음으로 방문할 점이, 아직 방문하지 않은 점이라면
                    map.put(next, new HashSet<>()); //key에 추가함으로서 방문 표시
                } else if (map.containsKey(next) && !map.get(cur).contains(next)) {
                    //다음으로 방문할 점이, 이미 방문했지만 현재 점에서는 방문하지 않았으면
                    answer++; //방이 만들어진다.
                }

                map.get(cur).add(next); //현재 점에서 다음으로 방문할 점 방문 표시
                map.get(next).add(cur); //

                cur = next;
            }
        }
        return answer;
    }
    static class Node {
        public int x;
        public int y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override //HashSet과 HashMap에 저장하기 위해
        public int hashCode() {
            return Objects.hash(x, y);
        }

        @Override //각 점을 비교하여 같은 점인지 확인하기 위해
        public boolean equals(Object o) {
            return this.x == ((Node) o).x && this.y == ((Node) o).y;
        }
    }
}
import java.util.*;
class Solution {
    public int solution(int distance, int[] rocks, int n) {
        int answer = 0;
        int left = 0;
        int right = distance;
        Arrays.sort(rocks);

        while(left <= right) {
            int mid = (left + right) / 2;
            int stone = 0; // 제거할 돌
            int mark = 0; // 기준점이 되는 돌

            for (int i = 0; i < rocks.length; i++) {
                if (rocks[i] - mark < mid)
                    stone++;
                else{
                    mark = rocks[i];
                }
            }
//            if(distance - rocks[rocks.length-1] < mid)
            if (distance - mark < mid ) {
                stone++;
            }
            if(stone <= n) {
                answer = mid;
                left = mid + 1;
            }
            else {
                right = mid -1;
            }
        }
        return answer;
    }
}
import java.util.*;
class Solution {
    public long solution(int n, int[] times) {
        long answer = 0;
        Arrays.sort(times);

        // 0 ~ 가장 오래 걸리는 시간으로
        long left = 0;
        long right = times[times.length-1] * (long)n; // 가장 오래 걸리는 시간

        while(left <= right) {
            long mid = (left + right) / 2;
            long complete = 0; // 입국심사 된 총 인원
            for (int i = 0; i < times.length; i++)
                complete += mid / times[i];
            if (complete < n) // 총 인원 < 해야할 인원
                left = mid + 1; // 되지 않았기 때문에 다시 이분탐색
            else {  // 총 인원 >= 해야할 인원
                right = mid - 1;
                answer = mid;
            }
        }
        return answer;
    }
}
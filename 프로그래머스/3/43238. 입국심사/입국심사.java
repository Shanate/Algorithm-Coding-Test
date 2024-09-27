import java.util.*;
class Solution {
    public long solution(int n, int[] times) {
        long answer = 0;
        Arrays.sort(times);

        // 0 ~ 가장 오래 걸리는 시간으로
        long left = 0;
        long right = times[times.length-1] * (long)n; // 가장 오래 걸리는 시간
        /* gpt가 말씀하시길,
        times[times.length - 1]가 1,000,000,000이고,
n이 1,000,000이라면,
이 둘을 곱한 값은 1,000,000,000,000,000이 되는데,
이는 int의 최대값인 2,147,483,647를 초과합니다. 따라서 오버플로우가 발생하여 값이 엉뚱한 작은 값으로 변할 수 있습니다.
이를 방지하려면 곱셈 연산이 발생하기 전에 두 값 중 하나를 long으로 변환해주어야 합니다.
*/
        while(left <= right) {
            long mid = (left + right) / 2;
            long complete = 0; // 입국심사 된 총 인원
            for (int i = 0; i < times.length; i++) {
                complete += mid / times[i];
            }
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
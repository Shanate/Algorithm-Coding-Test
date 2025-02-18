import java.io.*;
import java.util.*;

/*
현재 퍼즐 소요 시간 : time_cur
이전 퍼즐 소요 시간 : time_prev
숙련도 : level
난이도 : diff
diff <= level -> time_cur만 사용
diff > level -> diff-level만큼 틀림. 틀리면, (diff-level)*(time_cur+time_prev)+time_cur : time_total
time_total은 limit 내에 풀어야 함. 이 때, 최소 level을 구하라.

*/

public class Solution {
    static int solution(int[] diffs, int[] times, long limit) {
        int answer = 0;
        int low = 1; // diff 난이도
        int high = 100000;

        while(low <= high) {
            int level = (low + high) / 2;
            long time_total = minTotal(diffs, times, level);
            if(time_total <= limit) {
                high = level - 1;
                answer = level;
            } else if(time_total > limit) {
                low = level + 1;
            }
        }
        return answer;
    }

    static long minTotal(int[] diffs, int[] times, int level) {
        long time_total = 0;
        int time_prev = 0;

        for(int i = 0; i < diffs.length; i++) {
            if(diffs[i] <= level){
                time_total += times[i];
            } else if(diffs[i] > level) {
                time_total += (diffs[i] - level) * (times[i] + time_prev) + times[i];
            }
            time_prev = times[i];
        }
        return time_total;

       /* for(int i = 0; i < diffs.length; i++) {
            int time = diffs[i] - level;

        if(time < 0) {
            time_total += times[i];
            continue;
        }
            if (i == 0) {
                time_total += (long) times[i] * time + times[i];
            } else if (i != 0) {
                time_total += (long) (times[i - 1] + times[i]) * time + times[i];
            }
        }
        return time_total;*/
    }
    public static void main(String[] args) {
        int[] diffs = new int[]{1, 5, 3};
        int[] times = new int[]{2, 4, 7};
        long limit = 30;
        System.out.println(solution(diffs, times, limit));

        diffs = new int[]{1, 4, 4, 2};
        times = new int[]{6, 3, 8, 2};
        limit = 59;
        System.out.println(solution(diffs, times, limit));

        diffs = new int[]{1, 328, 467, 209, 54};
        times = new int[]{2, 7, 1, 4, 3};
        limit = 1723;
        System.out.println(solution(diffs, times, limit));

        diffs = new int[]{1, 99999, 100000, 99995};
        times = new int[]{9999, 9001, 9999, 9001};
        limit = 3456789012L;
        System.out.println(solution(diffs, times, limit));
    }
}

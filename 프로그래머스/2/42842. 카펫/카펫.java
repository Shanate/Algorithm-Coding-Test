import java.io.*;
import java.util.*;
/*
노란색은 무조건 중앙에 칠한다.
갈색은 테두리에 칠한다.
단, 가로 길이>=세로 길이
1. brown + yellow = 카펫의 넓이
*/

class Solution {
    static int[] solution(int brown, int yellow) {
        int[] answer = {};
        int sum = brown + yellow; // 12 = 10 + 2


        for(int x=sum; x>=1; x--){
            //제한 조건 1 : x>=y
            //제한 조건 2 : 경우의 수에서 x가 최소
            if (sum % x != 0) continue;
            int y = sum / x;
            if (x<y) break; // 더 이상 찾을 필요 X
            if( (x-2)*(y-2) == yellow) { // 카펫 내부에 채워져야 하는 노란 타일의 갯수
                                         // 이 코드를 적용하지 않으면, 코드는 단순하게 x>=y이면서, x가 가장 작을 때만을 값을 가진다.
                answer = new int[]{x, y};
                break;
            }
        }

        return answer;
    }
}

import java.io.*;
import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
     int[] answer = {};
// --------------------- 찍는 방식 --------------------- //
            int[] stu1 = new int[] {1, 2, 3, 4, 5}; // 5
            int[] stu2 = new int[] {2, 1, 2, 3, 2, 4, 2, 5}; // 8
            int[] stu3 = new int[] {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}; // 10
// ex) answers(7개) :    1   1   2   2   3   3   4
// 반복할 수 있는 장치가 필요
// --------------------- 반복 장치 --------------------- //
            int[] stuAns1 = new int[answers.length];
            int[] stuAns2 = new int[answers.length];
            int[] stuAns3 = new int[answers.length];
        for(int i = 0; i < answers.length; i++) {
            stuAns1[i] = stu1[i%5];
            stuAns2[i] = stu2[i%8];
            stuAns3[i] = stu3[i%10];
        }

// --------------------- 정답 갯수 카운트 --------------------- //
            int ans1 = 0;
            int ans2 = 0;
            int ans3 = 0;
        for(int i = 0; i < answers.length; i++) {
            ans1 = (stuAns1[i] == answers[i]) ? ++ans1 : ans1;
            ans2 = (stuAns2[i] == answers[i]) ? ++ans2 : ans2;
            ans3 = (stuAns3[i] == answers[i]) ? ++ans3 : ans3;
        }
// --------------------- 갯수 비교 --------------------- //

            int maxScore = Math.max(ans1, Math.max(ans2, ans3));
            List<Integer> topScorers = new ArrayList<>();

            if (ans1 == maxScore) topScorers.add(1);
            if (ans2 == maxScore) topScorers.add(2);
            if (ans3 == maxScore) topScorers.add(3);

            answer = new int[topScorers.size()];
            for (int i = 0; i < topScorers.size(); i++) {
                answer[i] = topScorers.get(i);
            }


            return answer;
        }
}
class Solution {
    static int[] solution(String s) {
        int[] answer = new int[2];
        int cnt_0 = 0;

        while (s.length() > 1) {
        int cnt_1 = 0;

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '0') {
                    cnt_0++;
                } else {
                    cnt_1++;
                }
            }
            s = Integer.toBinaryString(cnt_1);
            answer[0]++;
        }

        answer[1] = cnt_0;

            return answer;
    }
}
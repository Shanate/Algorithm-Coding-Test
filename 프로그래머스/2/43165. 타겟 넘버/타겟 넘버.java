class Solution {
        static int answer;

    static void dfs(int[] numbers, int target, int depth, int sum) {
        if(depth == numbers.length) {
            if(target == sum) {
                answer++;
            }
            return;
        }
        dfs(numbers, target, depth+1, sum+numbers[depth]);
        dfs(numbers, target, depth+1, sum-numbers[depth]);
    }

    static int solution(int[] numbers, int target) {
        answer = 0;
        dfs(numbers, target, 0, 0);
        return answer;
    }

}
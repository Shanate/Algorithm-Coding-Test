class Solution {
  static int solution(int n) {
        int answer = fibo(n);

        return answer;
    }

    static int fibo(int n) {
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % 1234567;
        }
        return dp[n];
    }

    public static void main(String[] args) throws Exception {
        int n = 3;
        System.out.println(solution(n));

        n = 5;
        System.out.println(solution(n));
    }
}
class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i=1; i<=n; i++){ // 시작 배열
            int sum = 0;
            for(int j = i; j<= n; j++){ // 덧셈 배열
                sum += j;
                if(sum == n){
                    answer++;
                } // if
                if(sum > n) break;
            } // for j
        } // for i
        
        return answer;
    }
}
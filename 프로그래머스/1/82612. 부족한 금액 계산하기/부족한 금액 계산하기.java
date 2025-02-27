import java.math.*;

class Solution {
    
    static long sum;
    
    public long solution(int price, int money, int count) {
        long answer = 0;
        sum = 0;
        
        recur(price, 1, count);
        answer = (money >= sum) ? 0 : Math.abs(money-sum);
        return answer;
    }
    
    static void recur(int price, int cnt, int count){
        if(cnt>count) return;
        sum += price*cnt; // money에서 뺄 합계
        recur(price, cnt+1, count);
    }
}
class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        
        for(int ele : arr){
            answer += ele;
        }
        answer = answer/arr.length;
        
        return answer;
    }
}
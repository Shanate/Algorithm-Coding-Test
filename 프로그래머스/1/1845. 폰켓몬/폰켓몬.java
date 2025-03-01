import java.util.*;
class Solution {
    
    public int solution(int[] nums) {
        int answer = 0;
        
        HashSet<Integer> set = new HashSet<>();
        
        for(int ponkemon : nums){
            set.add(ponkemon);
        }
        
        if(nums.length/2 < set.size()){
            return nums.length/2;
        } else {
            return set.size();
        }
    

    }
}
import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int getPokemon = nums.length / 2;
        HashSet<Integer> set = new HashSet<>(); // 중복 원소 버리기 위해서 HashSet 사용

        for(int number : nums) {
            set.add(number); // 여기서 중복 제거
        }

        if(getPokemon >= set.size()) {
            return set.size();
        } else {
            return getPokemon;
        }
//        return answer;
    }
}


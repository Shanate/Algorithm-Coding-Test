import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String,Integer> map = new HashMap<>();

        for(String cloth[] : clothes){
            map.put(cloth[1], map.getOrDefault(cloth[1], 0) + 1); // yellow_hat, blue_sunglasses, green_turban
        }                                                                    // headgear : 2    eyewear : 1
        for(String cloth : map.keySet()){                                    // headgear : 3    eyewear : 2
            answer *= map.get(cloth) + 1;                                    // 3 * 2 = 6
        }
        answer = answer-1;                                                   // 6-1 = 5

        return answer;
    }
}
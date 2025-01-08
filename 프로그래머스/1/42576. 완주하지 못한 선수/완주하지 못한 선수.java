import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        HashMap<String, Integer> map = new HashMap<>();

        for(String name : participant) {
            map.put(name, map.getOrDefault(name, 0) + 1);
        }
        for(String name : completion) {
            map.put(name, map.getOrDefault(name, 0) - 1);
        }

        for(String name : map.keySet()) {
            if(map.get(name) != 0) {
                answer = name;
            }
        }

        return answer;
    }
}
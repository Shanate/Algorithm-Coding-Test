import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        HashMap<String, Integer> runners = new HashMap<>();
        for(String runner : participant){
            runners.put(runner, runners.getOrDefault(runner, 0) + 1);
        }
        for (String finisher : completion) {
            runners.put(finisher, runners.get(finisher) - 1);
        }
        for(String name : runners.keySet()){
            if(runners.get(name) != 0){
                answer = name;
            }
        }
       
        
        return answer;
    }
}
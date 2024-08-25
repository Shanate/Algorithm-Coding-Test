import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (String participants : participant) { // 참가자를 카운팅. 동명이인 가능성을 두고 getOrDefault 사용
            hashMap.put(participants, hashMap.getOrDefault(participants, 0) + 1);
        }
        for (String completions : completion) { // 참가자를 디카운팅. 0이 되면 레이스 완주 성공
            hashMap.put(completions, hashMap.get(completions) - 1);
        }

        for(String key : hashMap.keySet()) { // 완주하지 못한 선수 색출
            if (hashMap.get(key) != 0) {
                answer = key;
            }
        }

        return answer;
    }
}
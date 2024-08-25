import java.util.*;
class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        HashMap<String, Integer> map = new HashMap<>();

        for(String number : phone_book) { // 119, 97674223, 1195524421
            map.put(number, 1);
        }
        for(String number : map.keySet()) {
            for(int i=1; i<number.length(); i++) {  // 3, 8, 10
                String prefix = number.substring(0, i); // for 문 돌면서 자른 문자열을 if문에서의 전화번호와 비교
                if(map.containsKey(prefix)) {
                    return false;
                }
            }
        }
        return true;
    }

}
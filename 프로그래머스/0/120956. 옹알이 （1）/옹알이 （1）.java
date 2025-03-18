import java.io.*;
import java.util.*;

class Solution {
    public int solution(String[] babbling) {
        int cnt = 0;
        
        String[] words = new String[]{"aya", "ye", "woo", "ma"};
        
        for(int i=0; i<babbling.length; i++){
            for(int j=0; j<words.length; j++){
                if(babbling[i].contains(words[j])){
                    babbling[i] = babbling[i].replace(words[j], " ");
                }
            }
            babbling[i] = babbling[i].replace(" ", "");
            if(babbling[i].equals("")){
                cnt++;
            }
        }
        
        
        return cnt;
    }
}
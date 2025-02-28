import java.util.*;

class Solution {
    
    static char[] str = {'A', 'E', 'I', 'O', 'U'};
    static ArrayList<String> dic = new ArrayList<>();
    
    public int solution(String word) {
        int answer = 0;
        dfs("");
        answer = dic.indexOf(word);
        
        return answer;
    }
    
    static void dfs(String makeWord){
        if(makeWord.length()>5) return;
        dic.add(makeWord);
        for(char spell : str){
            dfs(makeWord + spell);
        }
    }
    
    
}
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int cnt = str.length();

        for(int i=0; i<str.length(); i++){
            if(isPalind(str.substring(i))){
                break;
            }
            cnt++;
        }
        System.out.println(cnt);
    }
    static boolean isPalind(String str){
        int startIdx = 0;
        int lastIdx = str.length() - 1;
        while(startIdx <= lastIdx){
            if (str.charAt(startIdx) != str.charAt(lastIdx)) {
                return false;
            }
                startIdx++;
                lastIdx--;
        }
        return true;
        }
}

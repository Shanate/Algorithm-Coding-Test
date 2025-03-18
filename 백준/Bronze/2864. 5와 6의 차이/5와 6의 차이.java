import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        String inputA = st.nextToken();
        String inputB = st.nextToken();
        String aToFive = "", aToSix = "";
        String bToFive = "", bToSix = "";
        for (int i=0; i<inputA.length(); i++){
            if(inputA.charAt(i) == '5' || inputA.charAt(i) == '6'){
                aToFive += "5";
                aToSix += "6";
            } else {
                aToFive += inputA.charAt(i);
                aToSix += inputA.charAt(i);
            }
        }
        for (int i=0; i<inputB.length(); i++){
            if(inputB.charAt(i) == '5' || inputB.charAt(i) == '6'){
                bToFive += "5";
                bToSix += "6";
            } else {
                bToFive += inputB.charAt(i);
                bToSix += inputB.charAt(i);
            }
        }
        int min = Integer.parseInt(aToFive) + Integer.parseInt(bToFive);
        int max = Integer.parseInt(aToSix) + Integer.parseInt(bToSix);
        
        System.out.println(min + " " + max);
    }
}
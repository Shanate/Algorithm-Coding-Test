import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String spell = br.readLine();//주어진 알파벳
        int len = spell.length();
        int clk = 0;
        for(int i=0;i<len;i++) {
            switch(spell.charAt(i)) {
                case 'A': case 'B': case 'C':
                    clk += 2;
                    break;
                case 'D': case 'E': case 'F':
                    clk += 3;
                    break;
                case 'G': case 'H': case 'I':
                    clk += 4;
                    break;
                case 'J': case 'K': case 'L':
                    clk += 5;
                    break;
                case 'M': case 'N': case 'O':
                    clk += 6;
                    break;
                case 'P': case 'Q': case 'R': case 'S':
                    clk += 7;
                    break;
                case 'T': case 'U': case 'V':
                    clk += 8;
                    break;
                case 'W': case 'X': case 'Y': case 'Z':
                    clk += 9;
                    break;
            }
        }
        System.out.println(clk+spell.length());
    }
}
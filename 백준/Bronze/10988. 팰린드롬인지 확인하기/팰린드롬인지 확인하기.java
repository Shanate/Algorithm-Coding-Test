
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        // level //  l  e  v  e  l
        int output = 1;
        for (int i=0; i<input.length(); i++){
            char c = input.charAt(i);
            if(c != input.charAt(input.length()-i-1)){
                output = 0;
                break;
            }
        }
        System.out.println(output);
        }
    }

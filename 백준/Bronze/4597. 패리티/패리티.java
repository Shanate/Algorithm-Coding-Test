import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String answer;
        String bitString;

    while(!(bitString = br.readLine()).equals("#")){
        int cnt = 0;
        char Parity = bitString.charAt(bitString.length()-1);
            for(int i=0; i<bitString.length()-1; i++){
                if(bitString.charAt(i) == '1'){
                    cnt++;
                }
            }
            if(Parity == 'e'){
                if(cnt % 2 == 0){
                 answer = bitString.replace('e', '0');
                } else{
                    answer = bitString.replace('e', '1');
                }
            System.out.println(answer);
            }
            else if(Parity == 'o') {
                if (cnt % 2 == 0) {
                    answer = bitString.replace('o', '1');
                } else {
                    answer = bitString.replace('o', '0');
                }
                System.out.println(answer);
            }
            }
    }
}

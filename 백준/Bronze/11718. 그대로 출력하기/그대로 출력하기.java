import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        String str = "";
        while((str=br.readLine()) != null){
            sb.append(str).append("\n");
        }
        System.out.print(sb.toString());
    }
}
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double o = Math.pow(2, Integer.parseInt(br.readLine()));
        System.out.println((int)o);
    }
}

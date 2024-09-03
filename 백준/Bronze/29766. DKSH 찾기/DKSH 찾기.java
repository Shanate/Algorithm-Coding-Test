import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int length = s.length();
        int wordLength = s.replace("DKSH", "").length();
        System.out.println((length - wordLength) / 4);
    }
}
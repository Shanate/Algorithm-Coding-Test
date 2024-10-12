import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        str = str.replaceAll("c=", ".").replaceAll("c-", ".")
                .replaceAll("dz=", ".").replaceAll("d-", ".")
                .replaceAll("lj", ".").replaceAll("nj", ".")
                .replaceAll("s=", ".").replaceAll("z=",".");

        System.out.println(str.length());
    }
}

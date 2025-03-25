import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int hLo = Integer.parseInt(st.nextToken());
        int hHi = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(), " ");
        int sLo = Integer.parseInt(st.nextToken());
        int sHi = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(), " ");
        int vLo = Integer.parseInt(st.nextToken());
        int vHi = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(), " ");
        int r = Integer.parseInt(st.nextToken());
        int g = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());


        int M = Math.max(r, Math.max(g, b));
        int m = Math.min(r, Math.min(g, b));
        int V = M;

        double S = 255.0 * ((double) (V - m) / V);

        double H = 0;
        if (V == r) {
            H = 60.0 * (g - b) / (V - m);
        } else if (V == g) {
            H = 120.0 + 60.0 * (b - r) / (V - m);
        } else if (V == b) {
            H = 240.0 + 60.0 * (r - g) / (V - m);
        }

        if (H < 0) H += 360.0;


        if (H >= hLo && H <= hHi && S >= sLo && S <= sHi && V >= vLo && V <= vHi) {
            System.out.println("Lumi will like it.");
        } else {
            System.out.println("Lumi will not like it.");
        }

    }
}

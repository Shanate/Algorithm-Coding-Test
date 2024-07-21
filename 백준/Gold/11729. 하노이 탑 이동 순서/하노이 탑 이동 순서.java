import java.io.*;
public class Main {
    static StringBuilder sb = new StringBuilder();
    private static void hanoi(int n, int from, int mid, int to) {
        if(n==0) return;
        hanoi(n-1, from, to, mid);
        sb.append(from + " " + to + '\n');
        hanoi(n-1, mid, from, to);
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        sb.append((int) (Math.pow(2, N) - 1)).append('\n');

        hanoi(N, 1, 2, 3);
        System.out.println(sb);
    }
}
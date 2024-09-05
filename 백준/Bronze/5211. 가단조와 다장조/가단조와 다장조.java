import java.io.*;
import java.util.*;
public class Main {
        static char code;
        static char last;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int c = 0;
        int a = 0;
        ArrayDeque<Character> stack = new ArrayDeque<>();
        String codes = br.readLine();
        last = codes.charAt(codes.length() - 1);
        StringTokenizer st = new StringTokenizer(codes,"|");
        while(st.hasMoreTokens()) {
            code = st.nextToken().charAt(0);
                stack.offer(code);
                if (code == 'A' || code == 'D' || code == 'E') {
                    a++;
                } else if (code == 'C' || code == 'F' || code == 'G') {
                    c++;
                }
            }

        while(true) {
            if (a > c) {
                System.out.println("A-minor");
                break;
            } else if (a < c) {
                System.out.println("C-major");
                break;
            } else if (a == c){
/*                if (stack.peekLast() == 'A' || stack.peekLast() == 'D' || stack.peekLast() == 'E') {
                    System.out.println("A-minor");
                    break;
                } else if (stack.peekLast() == 'C' || stack.peekLast() == 'F' || stack.peekLast() == 'G') {
                    System.out.println("C-major");
                    break;
                } else{
                    stack.pollLast();
                }*/
                if(last == 'A' || last == 'D' || last == 'E') {
                    System.out.println("A-minor");
                    break;
                }
                else if(last == 'C' || last == 'F' || last == 'G') {
                    System.out.println("C-major");
                    break;
                }
            }

        }
    }
}

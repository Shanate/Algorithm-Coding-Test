import java.io.*;
import java.util.*;
public class Main {

    static int[] stack;
    static int size = 0;

    static void push(int item) {
        stack[size] = item;
        size++;
    }
     static int pop() {
        if(size == 0) {
            return -1;
        }
        else {
            int res = stack[size - 1];
            stack[size - 1] = 0;
            size--;
            return res;
        }
    }
     static int size() {
        return size;
    }
     static int empty() {
        if(size == 0) {
            return 1;
        }
        else {
            return 0;
        }
    }
     static int top() {
        if(size == 0) {
            return -1;
        }
        else {
            return stack[size - 1];
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer   sb = new StringBuffer();
        StringTokenizer st = null;

        int N = Integer.parseInt(br.readLine());
        stack = new int[N];
        while(N-- > 0){
            st = new StringTokenizer(br.readLine(), " ");
            switch(st.nextToken()) {
                case "push":
                    push(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    sb.append(pop()).append('\n');
                    break;
                case "size":
                    sb.append(size()).append('\n');
                    break;
                case "empty":
                    sb.append(empty()).append('\n');
                    break;
                case "top":
                    sb.append(top()).append('\n');
                    break;
            }
        }
        System.out.println(sb);
    }
}
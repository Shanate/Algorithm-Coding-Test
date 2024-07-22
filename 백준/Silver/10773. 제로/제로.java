import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();
        int K = Integer.parseInt(br.readLine());
        int sum = 0;
        for(int i=0; i<K; i++){
            int num = Integer.parseInt(br.readLine());
            if(num == 0){
                stack.pop();
            }
            else{
                stack.push(num);
            }
        }
        for(int ele : stack){
            sum += ele;
        }
        System.out.println(sum);
    }
}
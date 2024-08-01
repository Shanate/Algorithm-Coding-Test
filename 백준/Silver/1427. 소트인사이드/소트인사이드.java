import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = br.readLine(); // 2143
        int[] arr = new int[str.length()]; // 4
        for(int i=0; i<str.length(); i++){
            arr[i] = str.charAt(i) - '0'; // 2  1   4   3
        }
        Arrays.sort(arr);
        for(int i=arr.length-1; i>=0; i--){
            System.out.print(arr[i]);
        }
    }
}
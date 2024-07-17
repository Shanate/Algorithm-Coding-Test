import java.io.*;
import java.util.*;
// 자리수 더한 값이 9보다 클 경우 계속해서 더할 수 있게 만든다.
// 배열 생성해서 더하면 될 것 같다.
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine(); //문자열로 입력받아 정수로 쪼개기
        int[] Arr = new int[N.length()];
        if(N.length() == 1){
            int single = N.charAt(0)-'0';
            System.out.println(0);
            System.out.println(single%3==0 ? "YES" : "NO");
            return;
        }
        int cnt=0;
        int sum=0;
        String ans;
            for(int i=0; i<N.length(); i++){
                Arr[i] = N.charAt(i)-'0';
                sum += Arr[i];
            }
            cnt++;
        while(sum==0 || sum>=10){
            if(sum>0 && sum<10) break;
            String M = String.valueOf(sum); // 받은 sum을 문자열로 변환
            int[] sumArr = new int[M.length()]; // M의 자릿수만큼 배열 생성
            sum = 0;
            for(int i=0; i<M.length(); i++){
                sumArr[i] = M.charAt(i)-'0'; // M의 각 자리를 배열에 입력
                sum += sumArr[i];
            }
                cnt++;
        }
        ans = (sum%3==0) ? "YES" : "NO";
            System.out.println(cnt);
        System.out.println(ans);
    } // main
} // class

import java.util.*;

class Solution {
    static Set<Integer> set = new HashSet<>();
    static boolean[] visited;

    static void comb(int[] num, String curnum, int cnt) {
        if(cnt>0){
            set.add(Integer.parseInt(curnum));
        }
        if(cnt==num.length){
            return;
        }
        for(int i=0; i<num.length; i++){
            if(!visited[i]){
                visited[i] = true;
                comb(num,curnum+num[i],cnt+1);
                visited[i] = false;
            }
        }
    }

    static boolean isPrime(int number) {
        if(number<=1){
            return false;
        }
        for(int i=2; i<=number/2; i++){
            if(number%i==0){
                return false;
            }
        }
                return true;
    }

        static int solution(String numbers) {
            int answer = 0;
            set.clear();
            int[] num = new int[numbers.length()];
            visited = new boolean[numbers.length()];

        for(int i = 0; i < numbers.length(); i++) {
            num[i] = numbers.charAt(i) - '0'; // -> num[0] = 1, num[1] = 7
        } // 부분 집합을 만들기 위해 원소 찢기

            comb(num, "", 0);

            for(int number : set){
                if (isPrime(number)) {
                    answer++;
                }
            }

            return answer;
        }


}
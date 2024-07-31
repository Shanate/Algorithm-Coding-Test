import java.util.Arrays;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";

        String[] str = new String[numbers.length]; // 입력 개수만큼 문자열 배열 생성
         for(int i=0; i<numbers.length; i++){
             str[i] = String.valueOf(numbers[i]); // 문자열 배열에 정수형 입력을 문자형 입력으로 변환해 대입
         }

         Arrays.sort(str, (o1, o2) -> (o2+o1).compareTo(o1+o2));

         StringBuilder sb = new StringBuilder();
         for(String s : str){
             sb.append(s);
         }
        if(sb.charAt(0) == '0') {
            return "0";
        }


        return sb.toString();
        }
    }
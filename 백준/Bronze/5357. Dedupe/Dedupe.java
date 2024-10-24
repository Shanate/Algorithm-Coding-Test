import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

                int n = sc.nextInt();  // 데이터 셋의 수 입력 받기
                sc.nextLine();  // 개행 문자 처리

                for (int i = 0; i < n; i++) {
                        String string = sc.nextLine();  // 문자열 입력 받기

                        // 중복 제거
                        StringBuilder sb = new StringBuilder();
                        sb.append(string.charAt(0));  // 첫 번째 문자는 그대로 저장
                        for (int j = 1; j < string.length(); j++) {
                                if (string.charAt(j) != string.charAt(j-1)) {
                                        sb.append(string.charAt(j));
                                }
                        }

                        System.out.println(sb.toString());
                }
                sc.close();
        }
}
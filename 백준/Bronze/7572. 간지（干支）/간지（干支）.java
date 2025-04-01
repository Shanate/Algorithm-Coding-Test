import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int y = Integer.parseInt(br.readLine());
		int index10 = 7; // 십간의 시작은 '갑'에 해당하는 인덱스인 7부터 시작
		int index12 = 9; // 십이지의 시작은 '자'에 해당하는 인덱스인 9부터 시작
		
		// 입력된 연도만큼 반복하여 간지 계산
		for (int i = 2; i <= y; i++) {
			index10++; // 십간 인덱스 증가
			if (index10 == 10) { // 십간은 10년 주기로 순환하므로 10이 되면 다시 0으로 초기화
				index10 = 0;
			}
			
			index12++; // 십이지 인덱스 증가
			if (index12 == 12) { // 십이지는 12년 주기로 순환하므로 12가 되면 다시 0으로 초기화
				index12 = 0;
			}
		}
		
		char c = (char)(index12 + 'A'); // '자'부터 시작하기 때문에 'A'를 더해 알파벳으로 변환
		sb.append(c).append(index10); // 변환된 십이지와 십간을 StringBuilder에 추가
		System.out.println(sb);
	}
}

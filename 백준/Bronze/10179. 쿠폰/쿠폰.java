import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//첫 줄에 테이트 케이스의 수를 입력
		int N = Integer.parseInt(br.readLine());
		
		//for문에 i를 0부터 N까지 지정하므로써 N번 반복하게 설정
		for(int i = 0; i < N; i++) {
			//반복 횟수 만큼 금액을 입력. 입력값이 실수이니 double형으로 형변환
			double money = Double.parseDouble(br.readLine());
			//20프로 할인은 곱하기 0.8로 연산
			money *= 0.8;
			
			System.out.println("$" + String.format("%.2f", money));
		}
	}
}
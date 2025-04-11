import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int i = 1;
		
		//무한루프
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			//소수점 자릿수 표현을 위해 실수형으로 선언
			double a = Double.parseDouble(st.nextToken());
			double b = Double.parseDouble(st.nextToken());
			double c = Double.parseDouble(st.nextToken());
			
			//0 0 0 입력 시 무한루프 종료
			if(a == 0 && b == 0 && c == 0) break;
			
			//조건에 따라 변하지 않는 출력문
			System.out.println("Triangle #" + i);
			
			if(a == -1) {
				if(c <= b) {
					System.out.println("Impossible.");
				}else {
					a = Math.sqrt((c * c) - (b * b));
					System.out.println("a = " + String.format("%.3f", a));
				}
			}
			if(b == -1) {
				if(c <= a) {
					System.out.println("Impossible.");
				}else {
					b = Math.sqrt((c * c) - (a * a));
					System.out.println("b = " + String.format("%.3f", b));
				}
			}
			if(c == -1) {
				c = Math.sqrt((a * a) + (b * b));
				System.out.println("c = " + String.format("%.3f", c));
			}
			//다음 케이스의 번호를 넣어주기 위해 i에 +1해준다.
			i++;
			System.out.println();
		}
	}

}
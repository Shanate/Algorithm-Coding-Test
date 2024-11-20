import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		//토큰의 개수를 저장한다.
		int count = st.countTokens();
		//값들의 합을 저장 할 변수
		int sum = 0;
		
		for(int i = 0; i < count; i++) {
			sum += Integer.parseInt(st.nextToken());
		}
		
		System.out.println(sum);
	}

}
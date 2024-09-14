import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			//토큰의 개수를 저장한다.
			int count = st.countTokens();
			//값들의 합을 저장 할 변수
			int sum = 0;
			
			for(int j = 0; j < count; j++) {
				sum += Integer.parseInt(st.nextToken());
			}
			
			System.out.println(sum);
		}
	}

}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//1번 바구니
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		//2번 바구니
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		int C = Integer.parseInt(st2.nextToken());
		int D = Integer.parseInt(st2.nextToken());
		
		//이동 횟수가 적은 걸 출력
		if((A + D) > (B + C)) {
			System.out.println(B + C);
		}else {
			System.out.println(A + D);
		}
	}

}
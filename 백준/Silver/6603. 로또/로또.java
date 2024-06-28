
import java.io.*;
import java.util.*;
// Combination을 사용해 사용할 로또 번호를 K개 중 6개를 집합으로 묶는다.
public class Main {
		static int K;
		static int[] arr; // 선택할 로또번호
		static int[] result; // 제출할 로또
		static StringBuilder sb = new StringBuilder();
	
		static void backtracking(int start, int depth) {
			if(depth == 6) { // 배열에 번호 6개가 들어오면 그대로 종료하고 제출
				for(int i=0; i<6; i++) {
					System.out.print(result[i]+" ");
				}
				System.out.println();
				return;
			} // 재귀본문
			for(int i=start; i<K; i++) {
				result[depth] = arr[i];
				backtracking(i+1,depth+1);
				}
			}
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while(true) {
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			K = Integer.parseInt(st.nextToken());
		
		if (K == 0)  // 종료 조건 : K=0
			break;
			 
			arr = new int[K];
			result = new int[6]; // 6개를 택해서 제출
			for(int i = 0; i<K; i++) {
				arr[i] = Integer.parseInt(st.nextToken()); // 선택할 번호 입력
			}
			backtracking(0, 0);
			
			System.out.println();
		}
	}
}
import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int		N	= Integer.parseInt(br.readLine()); //N=5
		int[]	P	= new int[N]; // 기존 배열
		int[]	Ans = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i=0; i<N; i++) {
			P[i]	= Integer.parseInt(st.nextToken()); // 3 1 4 3 2
		}
		Arrays.sort(P);  // 1 2 3 3 4
		
			Ans[0] = P[0];
			int sum = Ans[0];
		for(int i=0; i<N-1; i++) {
			Ans[i+1] = Ans[i]+P[i+1];
			sum += Ans[i+1];
		}
		/*		
			A[0] = P[0]	
			A[1] = A[0]+P[1]
			A[2] = A[1]+P[2]
			A[3] = A[2]+P[3]
			A[4] = A[3]+P[4]
			*/	
		System.out.println(sum);
//		System.out.println(Arrays.toString(P));

// 한번에 더하기는?
		
	}
}

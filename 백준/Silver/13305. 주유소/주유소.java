import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 도시의 수
		
		int R = N-1; // 도로의 수
		long[] City = new long[N];
		long[] Road = new long[R];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		for(int i=0; i<R; i++) { // 도로의 거리
			Road[i] = Long.parseLong(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine()," ");
		for(int i=0; i<N; i++) { // 도시의 기름값
			City[i] = Long.parseLong(st.nextToken());
		}
		long totalCost = 0;
		long Cost = City[0];
		
		for(int i=0; i<R; i++) {
		if(City[i] < Cost) { // 최저 비용을 비교해 갱신
			Cost = City[i];
			}
			totalCost += Cost * Road[i];
		}
		System.out.println(totalCost);
	}
}
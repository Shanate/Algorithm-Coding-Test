import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static int n,m;
	static Long[] arr;
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		arr = new Long[ n];
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			arr[i]= Long.parseLong(st.nextToken());
		}
		
		long sum =0;
		
		//슬라이딩 윈도우는 구간이 정해져있는것
		for(int i=0; i<m; i++) { //먼저 구간만큼을 더해준다.
			sum+=arr[i];
		}
		
		long max = sum;
		for(int j=0; j+m<n; j++) { //앞에꺼 j에 대해서는 빼주고 j+m에 대해서는 더해주는식으로 진행
			
			sum-=arr[j];
			sum+=arr[j+m];
			max=Math.max(max, sum);
			
			
		}
		
		System.out.println(max);
		
	}
	
	
}
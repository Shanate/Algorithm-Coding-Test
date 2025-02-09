import java.io.*;
import java.util.*;

public class Main {
	
	static int N, M;
	static int[] lesson;
	static int left, right;

	public static void main(String[] args) throws Exception{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		lesson = new int[N];
		
		st = new StringTokenizer(br.readLine()," ");
		int sum = 0;
		for (int i = 0; i < N; i++) {
			lesson[i] = Integer.parseInt(st.nextToken());
			sum += lesson[i]; 
			left = Math.max(left, lesson[i]);
		}
		right = sum;  
		
		System.out.println(binSearch(left,right));

	}
	public static long binSearch(long left, long right) {
		while(left <= right) {
			long sum = 0;
			long mid = (left+right)/2;
			int count = 1;  
			for (int i = 0; i < N; i++) {
				sum += lesson[i];
				if(sum > mid) {
					sum = lesson[i];
					count ++;
				}
			}
			if(count <= M) {
				right = mid - 1;
			}
			else {
				left = mid +1;
			}
		}
		return left;
	}
}
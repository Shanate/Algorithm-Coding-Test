
import java.io.*;
import java.util.*;
public class Main {
	static int N,ans,col[]; // 백트랙킹을 위한 지역 변수로 설정. // 인덱스는 i축
	
	static boolean isAvailable(int rowNo) {
		for(int j=0; j<rowNo; j++) {
		if(col[rowNo]==col[j] ||
				Math.abs(col[rowNo]-col[j]) == Math.abs(rowNo-j)) return false; //대각선
		}
		return true;
	}
	static void nqueen(int rowNo) {
		if(!isAvailable(rowNo-1)) return;
		if(rowNo==N) {
			ans++;
			return;
		} 
			for(int i=0; i<N; i++) {
				col[rowNo]=i;
//				if(isAvailable(rowNo)) nqueen(rowNo+1);
				nqueen(rowNo+1);
			}
		}
	public static void main(String[] args) throws Exception { // N x N 행렬의 NQueen문제
		Scanner sc = new Scanner(System.in);
		N=sc.nextInt();
		col=new int[N];
		ans=0;
		nqueen(0);
		System.out.println(ans);
		sc.close();
	}
	
}
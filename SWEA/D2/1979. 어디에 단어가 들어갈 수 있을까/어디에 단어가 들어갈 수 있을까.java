
import java.util.Scanner;
import java.io.FileInputStream;


class Solution
{
	public static void main(String args[]) throws Exception
	{
		
	//	System.setIn(new FileInputStream("src/input.txt"));

	
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		int map[][];
	

		for(int test_case = 1; test_case <= T; test_case++)
		{
			int N = sc.nextInt();
			int K = sc.nextInt();
			
			map = new int[N][N];
			int ans = 0;
			
			for(int i=0; i<N; i++) {
				for(int j=0; j<N; j++) {
					map[i][j] = sc.nextInt();
				}
			}
			
			for(int i=0; i<N; i++) {
				int cnt = 0;
				for(int j=0; j<N; j++) {
					if(map[i][j] == 1) {
						cnt++;
					} else {
						if(cnt == K) {
						ans++;	
						} cnt=0;
					}
				}
					if (cnt == K) {
						ans++;
					}
				}
			
			
			
			for(int i=0; i<N; i++) {
				int cnt = 0;
				for(int j=0; j<N; j++) {
					if(map[j][i] == 1) {
						cnt++;
					} else {
						if(cnt == K) {
						ans++;	
						} cnt=0;
					}
				}
					if (cnt == K) {
						ans++;
					}
				}
			
			System.out.println("#" + test_case + " " + ans);
		}
	}
}
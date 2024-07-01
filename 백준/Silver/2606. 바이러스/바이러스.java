import java.io.*;
import java.util.*;

public class Main {
	static int n,m;
	static int[][] g;
	static boolean[] v;
	static int cnt;

	static void dfs(int i) {
		v[i]=true;
		cnt++;
//		System.out.print((i+1)+" ");
		for(int j=0; j<n; j++) {
			if(g[i][j] != 0 && !v[j]) { // 간선이 이어져있고 아직 방문되지 않을 때만을 고려하겠다.
				dfs(j);
			}
		}
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		n = Integer.parseInt(br.readLine());
		m = Integer.parseInt(br.readLine());
		g = new int[n][n];
		v = new boolean[n];
		cnt = 0;
		
		for(int i=0; i<m; i++) {
			st = new StringTokenizer(br.readLine()," ");
			int from = Integer.parseInt(st.nextToken())-1; //시정점
			int   to = Integer.parseInt(st.nextToken())-1; //종정점
			g[from][to]=1; // 단방향
			g[to][from]=1;

		}
		dfs(0);
		System.out.println(cnt-1); // 시작 정점은 제외
	}
}

// 탐색을 할 때마다 cnt를 +1 해주면 쉽게 풀릴듯. 
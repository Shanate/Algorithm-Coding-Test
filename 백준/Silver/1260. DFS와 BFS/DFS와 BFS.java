
import java.io.*;
import java.util.*;

public class Main {
		static int N, M, V;
		static int[][] g;
		static boolean[] v;
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		V = Integer.parseInt(st.nextToken());
		g = new int[N][N];
		v = new boolean[N];
		
		for(int i=0; i<M; i++) {
			st = new StringTokenizer(br.readLine()," ");
			int from = Integer.parseInt(st.nextToken())-1; //시정점
			int   to = Integer.parseInt(st.nextToken())-1; //종정점
			g[from][to]=1;
			g[to][from]=1;
		}
//		System.out.println(Arrays.deepToString(g));
		dfs(V-1); // 탐색 시작 정점부터 시작하기
		System.out.println();
		Arrays.fill(v, false);
		bfs(V-1);
	}

	 static void bfs(int i) {
		ArrayDeque<Integer> q=new ArrayDeque<>();
		v[i]=true;
		q.offer(i);
		while(!q.isEmpty()) {
			i=q.poll();
			System.out.print((i+1)+" ");
			for(int j=0; j<N; j++) {
				if(g[i][j] != 0 && !v[j]) {
					v[j]=true;
					q.offer(j);
				}
			}
		}
	}

	static void dfs(int i) {
		v[i]=true;
		System.out.print((i+1)+" ");
		for(int j=0; j<N; j++) {
			if(g[i][j] != 0 && !v[j]) {
				dfs(j);
			}
		}
	}
}

import java.io.*;
import java.util.*;

public class Main {
//DFS
	static int R,C,K;
	static char[][] map;
	static boolean[][] visited;
	static int[] di = {-1,0,1,0};
	static int[] dj = {0,1,0,-1};
	static int answer = 0;
	
	static void DFS(int row, int col, int depth) {
		if(row==1 && col==C) {
			if(depth==K) answer++;
			return;
		}
		
		for(int i=0; i<4; i++) {
			int ni = row + di[i];
			int nj = col + dj[i];
			
			if(1<=ni&&ni<=R && 1<=nj&&nj<=C) {
				if(visited[ni][nj]) continue;
				visited[ni][nj] = true;
				DFS(ni, nj, depth+1);
				visited[ni][nj] = false;
			}
		}
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		R = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		
		    map = new 	 char[R+1][C+1];
		visited = new boolean[R+1][C+1];
		
		for(int i=1; i<=R; i++) {
			String str = br.readLine();
			for(int j=1; j<=C; j++) {
				map[i][j] = str.charAt(j-1);
				if(map[i][j] == 'T')  //T는 방문처리 완료시켜 사용할 수 없게 만들어버림
					visited[i][j] = true;
			}
		}
					visited[R][1] = true; // 원점 방문처리
					DFS(R, 1, 1);		  // R, C, Depth

				System.out.println(answer);
			}
		}
//		.	.	.	.종점
//		.	T	.	.
//		.	.	.	.
//		원점
	


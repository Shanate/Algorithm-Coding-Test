import java.io.*;
import java.util.*;

public class Main {
	static int N, M;
	static int a, b, c;
	static List<int[]>[] g;
	static boolean[] v;
	static int[] w;
	
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		N = Integer.parseInt(br.readLine());
		M = Integer.parseInt(br.readLine());
		g = new List[N];
		for(int i=0; i<N; i++) {
			g[i] = new ArrayList<>();
		}
		
		for(int i=0; i<M; i++) {//------------
			st = new StringTokenizer(br.readLine()," ");
			a = Integer.parseInt(st.nextToken())-1;
			b = Integer.parseInt(st.nextToken())-1;
			c = Integer.parseInt(st.nextToken()); // 코스트
			if(c!=0) { g[a].add(new int[] {b,c});
						g[b].add(new int[] {a,c});
			}
		}
		v = new boolean[N];
		w = new int[N];
		for(int i=0; i<N; i++) w[i] = Integer.MAX_VALUE;
		int sum=0, cnt=0;
		w[0]=0;
		for(int i=0; i<N; i++) {
			int min = Integer.MAX_VALUE;
			int minVertex = -1;
			for(int j=0; j<N; j++) { // 방문하지 않았으면서 가중치가 최소인 곳
				if(!v[j] && min>w[j]) {
							min=w[j];
							minVertex=j;
				}
			}
			v[minVertex]=true;
			sum += min;
			if(cnt++==N-1) break;
			
			for(int[] j:g[minVertex]) {
				if(!v[j[0]] && w[j[0]]>j[1]) {
							   w[j[0]]=j[1];
				}
			}
		}
		System.out.println(sum);
	}
}
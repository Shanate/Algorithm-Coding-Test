import java.io.*;
import java.util.*;

public class Main{
	static int N,M;
	static int A,B,C;
	static List<int[]>[] g;
	static boolean[] v;
	static int[] w;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		g = new List[N];
		for(int i=0; i<N; i++) g[i] = new ArrayList<>();
		
		for(int i=0; i<M; i++) {
			st = new StringTokenizer(br.readLine()," ");
			A = Integer.parseInt(st.nextToken())-1;
			B = Integer.parseInt(st.nextToken())-1;
			C = Integer.parseInt(st.nextToken());
			g[A].add(new int[] {B,C});
			g[B].add(new int[] {A,C});
		}
		
		v =new boolean[N];
		w = new int[N];
		for(int i=0; i<N; i++) w[i] = Integer.MAX_VALUE;
		
		PriorityQueue<int[]> pq = new PriorityQueue<>((o1,o2)->Integer.compare(o1[1], o2[1]));
		int sum=0, cnt=0;
		w[0]=0;
		pq.offer(new int[] {0,0});
		while(!pq.isEmpty()) {
			int[] vc = pq.poll();
			int min = vc[1];
			int minVertex = vc[0];
			if(v[minVertex]) continue;
			
			v[minVertex]=true;
			sum += min;
			if(cnt++==N-1) break;
			
			for(int[] j:g[minVertex]) {
				if(!v[j[0]] && w[j[0]]>j[1]) {
					w[j[0]]=j[1];
					pq.offer(j);
				}
			}
		}
		                       System.out.println(sum);  
	}
	
	
	
}
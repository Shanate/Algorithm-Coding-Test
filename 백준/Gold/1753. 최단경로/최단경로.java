
import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(br.readLine())-1; // 시작할 정점
		List<int[]>[] g = new List[N];
		for(int i=0; i<N; i++) g[i] = new ArrayList<>();
		
		for(int i=0; i<M; i++) {
			st = new StringTokenizer(br.readLine()," ");
			int a = Integer.parseInt(st.nextToken())-1; // 시점
			int b = Integer.parseInt(st.nextToken())-1; // 종점
			int c = Integer.parseInt(st.nextToken()); // 가중치
			if(c!=0) g[a].add(new int[] {b,c}); // 인접정점번호, 비용
		}
		boolean[] v=new boolean[N];
		int[] d = new int[N];
		for(int i=0; i<N; i++) d[i]=Integer.MAX_VALUE;
		
		PriorityQueue<int[]> pq = new PriorityQueue<>((o1,o2)->Integer.compare(o1[1], o2[1]));
		d[K]=0; //출발점
		pq.offer(new int[] {K,d[K]});// 스타팅 포인트
		while(!pq.isEmpty()) {
			int[] vc = pq.poll();
			int min = vc[1];
			int minVertex = vc[0];
			if(v[minVertex]) continue;
			v[minVertex] = true;
//			if(minVertex==N-1) break;
			
			for(int[] j:g[minVertex]) {
				if(!v[j[0]] && d[j[0]]>min+j[1]) {
							   d[j[0]]=min+j[1];//
							   pq.offer(new int[] {j[0],d[j[0]]});	
				}
			}
		}
		for(int i=0; i<N; i++) {
			if(d[i] == Integer.MAX_VALUE) {System.out.println("INF");}
			else {System.out.println(d[i]);}
		}
	}
}
import java.io.*;
import java.util.*;

public class Main {
		static int N, M; // 문제수(정점), 정보(간선의 수)
		static List<Integer>[] question;
		static int[] indegree;
	
		static void bfs() {
			PriorityQueue<Integer> q = new PriorityQueue<>();
			for(int i=1; i<N+1; i++) {
				if(indegree[i]==0) q.offer(i);
			}
			while(!q.isEmpty()) {
				int i=q.poll();
				System.out.print(i+" ");
				for(int j:question[i]) {
					if(--indegree[j]==0) q.offer(j);
				}
			}
		}
	public static void main(String[] args) throws Exception{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			N = Integer.parseInt(st.nextToken());
			M = Integer.parseInt(st.nextToken());
			question=new List[N+1]; for(int i=1; i<N+1; i++) question[i]=new ArrayList<>();
			indegree=new int[N+1];
			
			for(int i=0; i<M; i++) {
				st = new StringTokenizer(br.readLine()," ");
				int fi = Integer.parseInt(st.nextToken());
				int la = Integer.parseInt(st.nextToken());
				question[fi].add(la);
				indegree[la]++;
			}
			bfs(); // 우선순위(fi)만을 오름차순 배열로 설정. 0번 넣으면 되겠다. => 가 아니라? PriorityQueue써보자
	}
}
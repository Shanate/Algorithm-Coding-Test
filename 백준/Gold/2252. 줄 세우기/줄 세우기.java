
import java.io.*;
import java.util.*;

public class Main {
	static int N, M; //정점, 간선의 수
	static List<Integer>[] students;
	static int[] indegree;
	
	public static void main(String[] args) throws Exception {

	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 StringTokenizer st = new StringTokenizer(br.readLine()," ");
	 N = Integer.parseInt(st.nextToken());
	 M = Integer.parseInt(st.nextToken());
	 students=new List[N+1]; for(int i=1; i<N+1; i++) students[i]=new ArrayList<>();
	 indegree=new int[N+1];
	 
	 for(int i=0; i<M; i++) {
		 st = new StringTokenizer(br.readLine()," ");
		 int A = Integer.parseInt(st.nextToken());
		 int B = Integer.parseInt(st.nextToken());
		 students[A].add(B);
		 indegree[B]++;
	 }
	 	bfs();
	}

	 static void bfs() {
		ArrayDeque<Integer> q=new ArrayDeque<>();
		for(int i=1; i<N+1; i++) {
			if(indegree[i]==0) q.offer(i);
		}
		while(!q.isEmpty()) {
			int i=q.poll();
			System.out.print(i+" ");
			for(int j:students[i]) {
				if(--indegree[j]==0) q.offer(j);
			}
		}
	}
}
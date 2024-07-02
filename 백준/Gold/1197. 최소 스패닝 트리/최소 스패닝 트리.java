
import java.io.*;
import java.util.*;

public class Main {

	static int V;
	static int[][] g;
	static int[] p;
	
	static void make() {
		p = new int[V];
		for (int i=0; i<V; i++) p[i] = i;
	}
	static int find(int a) {
		if (p[a] == a) return a;
		return p[a] = find(p[a]);
	}
	static boolean union(int a, int b) {
		int aRoot = find(a);
		int bRoot = find(b);
		if (aRoot == bRoot) return false;
		p[bRoot] = aRoot;
		return true;
	}
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		 V = sc.nextInt();
		 int E = sc.nextInt();
		 g=new int[E][3];
		for(int i=0; i<E; i++) {
			int A = sc.nextInt();//from
			int B = sc.nextInt();//to
			int C = sc.nextInt();//cost
			g[i] = new int[] {A,B,C};
		}
		Arrays.sort(g,(o1,o2)->Integer.compare(o1[2], o2[2]));
		make();
		int sum=0, cnt=0;
		for(int[] e:g) {
			if(union(e[0]-1,e[1]-1)) {
				sum += e[2];
				if(++cnt==V-1) break;
			}
		}
		System.out.println(sum);
		sc.close();
	}
}
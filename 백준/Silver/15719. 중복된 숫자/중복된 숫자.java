import java.io.*;
import java.util.*;
public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int n=Integer.parseInt(br.readLine());
		boolean[] num=new boolean[n];
		st=new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			int a=Integer.parseInt(st.nextToken());
			if(num[a]) {
				bw.write(a+"");
				break;
			}
				num[a]=true;
		}
		bw.flush();
	}
}
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int scenario = 0;
		StringTokenizer st;
		while (true) {
			scenario++;
			int N = Integer.parseInt(br.readLine());
			if(N==0) {
				break;
			}
			String[] girl = new String[N];
			char[] earing=new char[N];
			for(int i=0;i<N;i++) {
				girl[i]=br.readLine();
			}
			
			for(int i =0;i<2*N-1;i++) {
				st=new StringTokenizer(br.readLine());
				int num=Integer.parseInt(st.nextToken());
				
				if(earing[num-1]=='A' ||earing[num-1]=='B') { 
					earing[num-1] = st.nextToken().charAt(0);
					earing[num-1]='F';
				}else {
					earing[num-1] = st.nextToken().charAt(0);
				}
			}
			for(int i=0;i<N;i++) {
				if(earing[i] !='F') {
					bw.write(String.valueOf(scenario)+" "+girl[i]+"\n");
				}
			}
			
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
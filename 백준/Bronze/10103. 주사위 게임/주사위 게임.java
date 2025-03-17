import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int A = 100;
		int B = 100;
		
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			int cntA = Integer.parseInt(st.nextToken());
			int cntB = Integer.parseInt(st.nextToken());
			
			if(cntA > cntB) {
				B -= cntA;
			}else if(cntA < cntB) {
				A -= cntB;
			}
		}
		System.out.println(A);
		System.out.println(B);
	}

}
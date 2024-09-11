import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int max = 0;
			int min = 0;
			int j = 1;
			
			while(true) {
				if(a % j == 0 && b % j == 0) {
					min = j;
				}
				if(j % a == 0 && j % b == 0) {
					max = j;
					break;
				}
				j++;
			}
			System.out.println(max + " " + min);
		}
	}

}
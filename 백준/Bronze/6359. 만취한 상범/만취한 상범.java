import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	static int N;
	static int[] d;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int tc=1; tc<=t; tc++) {
			N=sc.nextInt();
			d=new int[N+1];//0잠김 1열림
			for(int i=1; i<=N; i++) {
				for(int j=1; i*j<=N; j++) {
					if(d[i*j]!=0) d[i*j]=0;
					else  d[i*j]=1;
				}
			}
			int ans=0;
			for(int i=1; i<=N; i++) {
				ans+=d[i];
			}
			System.out.println(ans);
		}
	}

}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		sb.append(st.nextToken().toUpperCase().charAt(0));
		while(st.hasMoreTokens()) {
			String str = st.nextToken();
			if(str.equals("i")) continue;
			if(str.equals("pa")) continue;
			if(str.equals("te")) continue;
			if(str.equals("ni")) continue;
			if(str.equals("niti")) continue;
			if(str.equals("a")) continue;
			if(str.equals("ali")) continue;
			if(str.equals("nego")) continue;
			if(str.equals("no")) continue;
			if(str.equals("ili")) continue;
			sb.append(str.toUpperCase().charAt(0));
		}
		System.out.println(sb);
	}
}
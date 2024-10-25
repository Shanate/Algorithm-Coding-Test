import java.io.BufferedReader;
import java.io.InputStreamReader;
 
public class Main {
 
	public static void main(String[] args) throws Exception{
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int tc = Integer.parseInt(br.readLine());
		
		for (int t = 0; t < tc; t++) {
			String pw = br.readLine();
			if (pw.length() >= 6 && pw.length() <= 9)
				System.out.println("yes");
			else
				System.out.println("no");
		}
	}
 
}
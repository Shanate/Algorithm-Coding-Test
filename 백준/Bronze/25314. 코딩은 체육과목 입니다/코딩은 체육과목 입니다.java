import java.io.*;
import java.util.*;
public class Main{
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int s = N/4;
		for(int i = 0; i<s; i++) {
			System.out.print("long ");
		}
		System.out.println("int");
	}
}
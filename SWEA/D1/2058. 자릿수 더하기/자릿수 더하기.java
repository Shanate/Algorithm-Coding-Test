import java.util.Scanner;
import java.io.FileInputStream;

class Solution {

	public static void main(String[] args) throws Exception {
		
//		System.setIn(new FileInputStream("src/input.txt"));

		
		Scanner sc = new Scanner(System.in);
		
//		int N = sc.nextInt(); // 6789
		
		String N = sc.nextLine();
		int sum = 0;
		
		for(int i=0; i<N.length(); i++) {
		
		int Number = N.charAt(i) - 48;
		sum += Number;
		}
		System.out.println(sum);
	}
}